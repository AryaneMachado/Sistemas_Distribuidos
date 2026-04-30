
public class Cube {
    private int content = -1;
    private boolean available = false; // Controle de estado: falso = vazio, verdadeiro = cheio
    public static final int LOOPS = 10;
    
    public synchronized int get(String consumer) {
        
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        
        System.out.printf("\nConsumidor %s consumiu %d", consumer, content);
        
        available = false;
        notifyAll();
        return content;
    }
    
    public synchronized void set(String producer, int value) {

        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        
        content = value;
        System.err.printf("\nProdutor %s produziu %d", producer, content);
        
        available = true;
        notifyAll();
    }
}