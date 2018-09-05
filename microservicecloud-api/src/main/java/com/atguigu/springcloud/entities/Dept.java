package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@SuppressWarnings("serial")
//@AllArgsConstructor//有参构造
@NoArgsConstructor//无参构造
@Data//get set equals hashCode toString
@Accessors(chain=true)//链式
public class Dept implements Serializable{
	private Long deptno;
	private String dname;
	private String db_source;
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
	
}
