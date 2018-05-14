package com.parent.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.parent.base.bus.Person;

/**
 * @description 执行类
 * @author slwu
 * @date 2018-05-12
 */
public class AppDay2_01 {

	//main方法  
	public static void main(String[] args) {
		List<Person> list_res = new ArrayList<Person>();
		
		Scanner scanner = new Scanner(System.in);
		String readLine = "";
		while(!"q".equals(readLine = scanner.nextLine())) {	
			switch(readLine) {
				case "i" : putPerson(scanner, list_res); break;
				case "l" : System.out.println(list_res); break;
				case "lq": query(scanner, list_res); break;
				case "d" : del(scanner, list_res); break;
			}
		}
		System.out.println("程序已经退出，游戏结束！");
	}
	
	//录入人
	private static void putPerson(Scanner scanner, List<Person> persons) {
		Person tempPerson = new Person();
		int i = 0;
		while(true) {
			if(0 == i) {
				System.out.println("请输入姓名：\n");
				String name = scanner.nextLine();
				tempPerson.setName(name);
			}
			if(1 == i) {
				System.out.println("请输入性别：\n");
				String sex = scanner.nextLine();
				tempPerson.setSex(sex);
			}
			if(2 == i) {
				System.out.println("请输入年龄：\n");
				String age = scanner.nextLine();
				tempPerson.setAge(age);
			}
			if(3 == i) {
				System.out.println("请输入身高：\n");
				String height = scanner.nextLine();
				tempPerson.setHeight(height);
				persons.add(tempPerson);
				System.out.println("录入人成功！！！如果要退出，请按q");
				break;
			}
			i++;
		}
	}
	
	//查看
	public static void query(Scanner scanner, List<Person> persons) {
		System.out.println("请输入你要查看人的姓名：");
		String name = scanner.nextLine();
		boolean isExist = false;
		for(Person p : persons) {
			if(name.equals(p.getName())) {
				isExist = true;
				System.out.println(p);
				break;
			}
		}
		if(!isExist) {
			System.out.println("i m sorry, not found!");
		} 
		System.out.println("如果继续请按lq!,退出游戏请按q");
	}
	
	//删除 
	public static void del(Scanner scanner, List<Person> persons) {
		System.out.println("请输入你要删除的人");
		String name = scanner.nextLine();
		for(Person p : persons) {
			if(name.equals(p.getName())) {
				persons.remove(p);
			}
		}
		System.out.println("删除成功，如果继续请按d,退出游戏请按q");
	}
}
