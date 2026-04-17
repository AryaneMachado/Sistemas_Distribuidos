package model;

public class JobRunnable implements Runnable {

	@Override
	public void run() {
		
        for (int i = 0; i< Job.MAX; i++) {
            System.err.printf("\n%s %d", Thread.currentThread().getName(), i);
            
            try {
            	
            	Thread.sleep(500);
            	
            } catch (InterruptedException ie) {
            	ie.printStackTrace();
            }
            
            System.err.flush();
        }
	}
	
	

}
