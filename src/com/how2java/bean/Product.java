package com.how2java.bean;

/**
 * Model层使用一个简单的Product用于存放数据
 * @author Administrator
 *
 */
public class Product {
	int id;
	String name;
	int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
