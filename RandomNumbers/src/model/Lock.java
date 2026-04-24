package model;

import java.util.concurrent.locks.ReentrantLock;

public class Lock {

	public static ReentrantLock lock = new ReentrantLock(true);
}
