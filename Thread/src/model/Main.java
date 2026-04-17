package model;

public class Main {

    public static void main(String[] args) {
        Job job1 = new Job();
        job1.setName("Thread 1 (Job 1)");
        job1.start();
        
       JobRunnable runnable = new JobRunnable();
       Thread job2 = new Thread();
       job2.setName("Thread 2 (Job 2");
       job2.start();

    }

}