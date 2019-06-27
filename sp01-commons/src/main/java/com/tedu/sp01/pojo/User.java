package com.tedu.sp01.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
public class User implements Serializable{
	private static final long serialVersionUID = 4712603522273282281L;
	private Integer id;
	private String username;
	private String password;
}
