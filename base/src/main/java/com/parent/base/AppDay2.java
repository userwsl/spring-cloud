package com.parent.base;

import com.parent.base.bus.Person;

//程序人口
public class AppDay2 {

	//
	public static void main(String[] args) {
		//定义男人对象
		Person zhangzhu = new Person();
		zhangzhu.setAge("28");
		zhangzhu.setHeight("170");
		zhangzhu.setSex("男");
		zhangzhu.setName("张主");
		System.out.println(zhangzhu);
	}
}
