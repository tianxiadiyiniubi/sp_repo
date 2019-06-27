package com.tedu.sp01.pojo;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
public class Order implements Serializable{
	private static final long serialVersionUID = 5641146955367416181L;
	private String id;
	private User user;
	private List<Item> items;
}
