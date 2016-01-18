package ru.pangaia.erudit.model;

import java.util.ArrayList;
import java.util.List;

import ru.pangaia.erudit.util.Bag;

public class Board {
	private static final String TOKENS_DEF_FILE = "tokens.def";
	private final static String tokens = "ааааббввггддееежжззиииииййккклллмммнннноооооопппрррссстттууфхцчшщъыьэюя";
	private Bag<Token> tokenPool;
	private GameField[][] gameMap;
	
	public Board() {
		List<Token> tokendata = Util.loadTokenDefs(TOKENS_DEF_FILE);
		Util.fillPool(tokendata, tokenPool);
	}
	
	private static class Util {
		private static boolean fillPool(List<Token> data, Bag<Token> pool) {if (pool.put(data)) {return true;} else {return false;}}
		private static List<Token> loadTokenDefs(String filename) {return new ArrayList<Token>();}
	}

}
