package model;

// Classe com a estrutura compartilhada
// entre Produtor e Consumidor

public class Cube {
	
	private Turn turn = Turn.PRODUCER;
	private int content = -1; 
	public static final int LOOPS = 10;
	
	public int get(String consumer) {
		
		while (turn != Turn.CONSUMER) System.out.print("");
		
		System.out.printf("\nConsumidor %s consumiu %d", consumer, content);
		
		/* System.out.flush(); */
		turn = Turn.PRODUCER;
		return content;
	}
	
	public void set(String producer, int value) {
		
		while (turn != Turn.PRODUCER) System.out.print("");
		
		content = value;
		System.out.printf("\nProdutor %s produziu %d", producer, content);
		/* System.err.flush(); */
		turn = Turn.CONSUMER;
	}
}
