package com.tedu.web.util;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonResult<T> implements Serializable{
	private static final long serialVersionUID = 2533350878537240283L;

	/** 成功 */
	public static final int SUCCESS = 200;

	/** 没有登录 */
	public static final int NOT_LOGIN = 400;

	/** 发生异常 */
	public static final int EXCEPTION = 401;

	/** 系统错误 */
	public static final int SYS_ERROR = 402;

	/** 参数错误 */
	public static final int PARAMS_ERROR = 403;

	/** 不支持或已经废弃 */
	public static final int NOT_SUPPORTED = 410;

	/** AuthCode错误 */
	public static final int INVALID_AUTHCODE = 444;

	/** 太频繁的调用 */
	public static final int TOO_FREQUENT = 445;

	/** 未知的错误 */
	public static final int UNKNOWN_ERROR = 499;
	
	private int code;
	private String msg;
	private T data;
	
	

	@SuppressWarnings("rawtypes")
	public static JsonResult build() {
		return new JsonResult();
	}
	@SuppressWarnings("rawtypes")
	public static JsonResult build(int code) {
		return new JsonResult().code(code);
	}
	@SuppressWarnings("rawtypes")
	public static JsonResult build(int code, String msg) {
		return new JsonResult<String>().code(code).msg(msg);
	}
	public static <T> JsonResult<T> build(int code, T data) {
		return new JsonResult<T>().code(code).data(data);
	}
	public static <T> JsonResult<T> build(int code, String msg, T data) {
		return new JsonResult<T>().code(code).msg(msg).data(data);
	}
	
	public JsonResult<T> code(int code) {
		this.code = code;
		return this;
	}
	public JsonResult<T> msg(String msg) {
		this.msg = msg;
		return this;
	}
	public JsonResult<T> data(T data) {
		this.data = data;
		return this;
	}
	
	
	@SuppressWarnings("rawtypes")
	public static JsonResult ok() {
		return build(SUCCESS);
	}
	@SuppressWarnings("rawtypes")
	public static JsonResult ok(String msg) {
		return build(SUCCESS, msg);
	}
	public static <T> JsonResult<T> ok(T data) {
		return build(SUCCESS, data);
	}
	@SuppressWarnings("rawtypes")
	public static JsonResult err() {
		return build(EXCEPTION);
	}
	@SuppressWarnings("rawtypes")
	public static JsonResult err(String msg) {
		return build(EXCEPTION, msg);
	}
	
	@Override
	public String toString() {
		return JsonUtil.to(this);
	}
}