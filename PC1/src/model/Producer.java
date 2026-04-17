package model;

public class Producer extends Thread {
	
	private String name;
	private Cube cube;
	
	public Producer(String name, Cube cube) {
		this.name = name;
		this.cube = cube;
	}
	
	// Produtor produz:

	public void run() {
		for (int i =0; i < cube.LOOPS; i++) {
			cube.set(name, i);
		}
	}
}
