package model;

public class RedGames extends Thread {
	
	private MegaSena megaSena;
	
	public RedGames(MegaSena megaSena) {
		this.megaSena = megaSena;
	}
	
	@Override
	public void run() {
		
		// código a ser executado, é o main da Thread
		
		for (int i = 0; i < MegaSena.NUMBER_OF_GAMES; i++) {
			
			while (Lock.lock.compareAndSet(0,  1) == false);
				System.err.print("");
			
			// região crítica:
			megaSena.play(System.err);
			
			// liberação:
			Lock.lock.set(0);
			
		}
		
	}

}
