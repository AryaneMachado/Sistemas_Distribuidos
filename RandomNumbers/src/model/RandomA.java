package model;

import java.util.Random;

public class RandomA extends Thread {

    @Override
    public void run() {
        
        while(true) {
            try {
            Lock.lock.acquire();
            // Seção Crítica
            System.out.println("random-a");
            int number = new Random().nextInt(1000);
            System.out.printf("a: %d\n", number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                Lock.lock.release();
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    
}