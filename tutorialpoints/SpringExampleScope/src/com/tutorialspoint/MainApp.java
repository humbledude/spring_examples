package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		example1();
		example2();
	}
	
	// example for scope=singletone
	private static void example1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld1");
		
		objA.setMessage("I'm obj A");
		objA.getMessage();
		
		HelloWorld objB = (HelloWorld) context.getBean("helloWorld1");
		objB.getMessage();
	}
	
	// example for scope=prototype
	private static void example2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld2");
		
		objA.setMessage("I'm obj A");
		objA.getMessage();
		
		HelloWorld objB = (HelloWorld) context.getBean("helloWorld2");
		objB.getMessage();
		
	}
	

}
