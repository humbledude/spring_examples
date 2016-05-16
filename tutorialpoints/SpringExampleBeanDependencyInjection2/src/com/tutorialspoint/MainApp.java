package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		example1();
		example2();
	}

	// with property tags
	private static void example1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");

		te.spellCheck();
	}

	// with p:xxx tags
	private static void example2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");

		te.spellCheck();
	}

}
