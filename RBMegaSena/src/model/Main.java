package model;

public class Main {
	
	public static void main (String[] args) {
		MegaSena megaSena = new MegaSena(6);
		
		/*T1*/
		RedGames redGames = new RedGames (megaSena);
		
		/*T2*/
		BlackGames blackGames = new BlackGames(megaSena);
		
		redGames.start();
		blackGames.start();
		
		
		/* ms.play(System.out);
		System.out.flush();
		ms.play(System.err); */
	}

}
