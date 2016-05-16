package com.tutorialspoint;

public class TextEditor {
	private SpellChecker spellChecker1;
	private SpellChecker spellChecker2;
	
	public TextEditor(SpellChecker spellChecker1, SpellChecker spellChecker2) {
		System.out.println("Inside TextEditor constructor");
		this.spellChecker1 = spellChecker1;
		this.spellChecker2 = spellChecker2;
	}
	
	public void spellCheck() {
		spellChecker1.checkSpelling();
		spellChecker2.checkSpelling();
	}

}
