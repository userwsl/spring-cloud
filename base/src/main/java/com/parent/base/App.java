package com.parent.base;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){

    	Scanner scanner = new Scanner(System.in);   

    	int i = 1;

    	int a = 0;

    	int b = 0;

    	while(scanner.hasNext()) {

    		if(0 == i % 2) {

    			b = scanner.nextInt();

    			System.out.println("a = " + a);

    			System.out.println("b = " + b);

    			System.out.println("a + b = "+ (a + b));
    		}
    		else {

    			a = scanner.nextInt(); 
    		}

    		i++;
    		System.out.println("你输入了 " + (i - 1) + "个数。");
    	}
    }
}
