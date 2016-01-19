package ru.pangaia.erudit.model;

public class GameField {
	public int x;
	public int y;
	public Bonus bonus;
	public Token letter;

	public GameField(int x, int y, Bonus bonus, Token token) {
		this.x = x;
        this.y = y;
        this.bonus = bonus;
        this.letter = token;
	}

}
