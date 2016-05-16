package com.tutorialspoint;

public class SpellChecker {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getName() {
		System.out.println("SpellChecker name : " + name);
	}
	
	public SpellChecker() {
		System.out.println("Inside SpellChecker constructor.");
	}

	public void checkSpelling() {
		System.out.println("Inside checkSpelling.. name is " + name);
	}
}
