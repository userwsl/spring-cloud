package com.parent.base.bus;

/**
 * @description 是个类，类的话，只要定义一下基本的一些属性，一些行为
 * @author slwu
 * 定义一个人的类
  *
 */
public class Person {

	//身高 TODO 作用域的概念
	private String height;
	//性别
	private String sex;
	//年龄
	private String age;
	//名字
	private String name;
	
	public Person() {};


	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

 	public String toString() {
		return "hello " + this.name + "\n"
				+ "年龄：" + this.age + "\n"
				+ "性别：" + this.sex + "\n"
			    + "身高：" + this.height + "\n";
	}
	
}
