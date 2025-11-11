package Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable {
    
    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    
    @Override
    public void run() {
        while (true) {
            try{
                System.out.println("Produced produced :: "+value);
                queue.put(value++);
                Thread.sleep(1000);

            }catch(Exception e){
                Thread.currentThread().interrupt();
                System.out.println("Producer interupted");
            }
        }
    }
    
}

class Producer implements Runnable {
    
    private BlockingQueue<Integer> queue;
    
    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    
    @Override
    public void run() {
        while (true) {
            try{
                Integer value = queue.take();
                System.out.println("Consumer consumed :: "+value);
                Thread.sleep(2000);

            }catch(Exception e){
                Thread.currentThread().interrupt();
                System.out.println("Consumer interuppted");
            }
        }
    }
    
}


public class BlockingQueueDemo {
    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));

        producer.start();
        consumer.start();

        // wait for queue to became non-empty / wait for space.
        // Simplicity concurrency like produce and consumer problem (solved)
        // standard queue --> no waiting immediately 
            //empty --> remove(no waiting )
            //full --> remove(no waiting )
            
        // Blocking queue
            // put --> block if the queue is full util space  became available
            // take --> block if the queue is empty util an element becomes available
            // offer --> waits for space to became availale, upto the specified timeout

            // BlockingQueue --> interface can not instantiated --> implements ArrayBlockingQueue

        // ArrayBlockingQueue --> a bounded queue blocked by an array.


    }
}
