package model;

public class Job extends Thread {
    
    public static final int MAX = 100;
    
    @Override
    public void run() {
        for(int i = 0; i < MAX; i++ ) {
            System.out.printf("\n%s %d", Thread.currentThread().getName(), i);
            System.out.flush();
        }
    }
}