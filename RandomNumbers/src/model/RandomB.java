package model;

import java.util.Random;

public class RandomB extends Thread {
    
    @Override
    public void run() {
        
        while(true) {
            try {
            Lock.lock.acquire();
            // Seção Crítica
            System.out.println("RANDOM-B");
            int number = new Random().nextInt(1000);
            System.out.printf("B: %d\n", number);
            
            
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                Lock.lock.release();
            }
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
        
    }
}