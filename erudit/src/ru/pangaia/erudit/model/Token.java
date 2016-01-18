package ru.pangaia.erudit.model;

public class Token {
	public int n;
	public String letter;
	public int value;
	private Player owner;
	
	public Token(String letter, int n, int val) {
		this.letter = letter;
		this.n = n;
		this.value = val;
		this.owner = null;
	}
}
