package model;

import java.io.PrintStream;
import java.util.Random;

public class MegaSena {
	
	private int valuesPerGame;
	private static final int MAX_VALUE = 60;
	// private static final int MIN_VALUE = 1;
	public static final int NUMBER_OF_GAMES = 10;
	
	
	public MegaSena (int valuesPerGame) {
		this.valuesPerGame = valuesPerGame;
	}
	
	public void play(PrintStream printer) {
		for (int i = 0; i < valuesPerGame; i++) {
			int value = new Random().nextInt(MAX_VALUE) + 1;
			
			printer.print(String.format(" %02d", value));
		}
		
		printer.flush();
		printer.println();
	}

}
