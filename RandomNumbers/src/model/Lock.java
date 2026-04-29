package model;

import java.util.concurrent.Semaphore;
//import java.util.concurrent.locks.ReentrantLock;

public class Lock {

	// public static ReentrantLock lock = new ReentrantLock(true);
	
	public static final Semaphore lock = new Semaphore(1);
	
}
