package model;

public class BlackGames extends Thread {
	
	private MegaSena megaSena;
	
	public BlackGames(MegaSena megaSena) {
		this.megaSena = megaSena;
	}
	
	@Override
	public void run() {
		
		// código a ser executado, é o main da Thread
		
		for (int i = 0; i < MegaSena.NUMBER_OF_GAMES; i++) {
			
			while (Lock.lock.compareAndSet(0,  1) == false);
			System.err.print("");
			
			// região crítica:
			megaSena.play(System.out);
			
			// liberação:
			Lock.lock.set(0);
			
		}
		
	}

}
