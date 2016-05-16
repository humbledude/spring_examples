package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
//		example1();
		example2();
	}
	
	// init & destroy method is declared can be declared on each bean definition
	private static void example1() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		
		context.registerShutdownHook();
	}
	
	// using default init & destroy method declaration
	private static void example2() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		
		context.registerShutdownHook();
	}
	

}
