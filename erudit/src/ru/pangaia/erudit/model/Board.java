package ru.pangaia.erudit.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import ru.pangaia.erudit.util.Bag;

public class Board {
	private static final String TOKENS_DEF_FILE = "erudit/tokens.html";
	private Bag<Token> tokenPool = new Bag<>();
	private GameField[][] gameMap;
	
	public Board() {
		List<Token> tokendata = Util.loadTokenDefs(TOKENS_DEF_FILE);

        System.out.println("creating board . . .");

		Util.fillPool(tokendata, tokenPool);
		gameMap = Util.makemap();
	}
	
	static class Util {
		private static boolean fillPool(List<Token> data, Bag<Token> pool) {
            if (pool.put(data)) {return true;}
            else {return false;}
        }

		private static List<Token> loadTokenDefs(String filename) {
			List baseTokens = new ArrayList<Token>();
			try {
				File file = new File(filename);
				Document table = Jsoup.parse(file, "UTF-8");
				List<String> tds = new ArrayList<String>();

				Iterator<Element> it = table.getElementsByTag("td").iterator();
				while (it.hasNext()) {
					String inner = it.next().text();
					if (!inner.isEmpty() && !inner.equals("—") && !inner.equals("Ё"))
					{tds.add(inner);}
				}
				for (int i = 0; i < tds.size(); i+=3) {
					String letter = tds.get(i);
					int n = Integer.parseInt(tds.get(i+1).split(" ")[0]);
					int val = Integer.parseInt(tds.get(i+2).split(" ")[0]);

					for (int j = 0; j< n; j++) {
						Token token = new Token(letter, n, val);
						baseTokens.add(token);
					}
				}
			}
			catch (IOException e) {
				//TODO process exception
			}

			return baseTokens;
		}

		private static GameField[][] makemap() {
			GameField[][] map = new GameField[15][15];
			for (int i = -8; i < 9; i++) {
				for (int j = -8; i < 9; j++) {
					map[i][j] = new GameField(i, j, Bonus.None, null);
				}
			}
			return map;
		}
	}

}
