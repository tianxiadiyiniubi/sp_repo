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
public class Item implements Serializable{
	private static final long serialVersionUID = -2246385786545525329L;
	private Integer id;
	private String name;
	private Integer number;
}
