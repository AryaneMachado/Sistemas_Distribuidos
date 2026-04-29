package model;

public class Main {
	
	public static void main(String[] args) {
		
		RandomA ra = new RandomA();
		RandomB rb = new RandomB();
		
		ra.start();
		rb.start();
		
		System.out.println("Fim da execução de " + Thread.currentThread().getName());
	}

}
