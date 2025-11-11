package Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

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
        // low memory overhead --> single lock
        // producer consumer -- deque and enque --> operation share lock with each other
        // use single lock for both enquire and deque
        //  more thread --> more problem

        // 2. LinkedBlockingQueue -->
        
        BlockingQueue<Integer> queue2 = new LinkedBlockingQueue<>();
        // if capacity is provided then it is saved if not provided then it will take Integer.MAX
        // backed by linkedList
        // higher concurrency between producers and consumers
        // use two seperate locks for enque and deque operations
        // used when more threads

        // 3. PriorityBlockingQueue --> unbounded  --> default inital capacity 11
        // orders their elemenets according to their natural order
        // same as priorityQueue --> Binary heap as array 
        // can grow and shrink dynamically
        // orders their elemenets according to their natural ordering or a provide Comparator
        // we can consume according to priority
        // put wont work

        // 4. SynchronisedQueue --> 
        // each insert operation must wait for a corresponding remove operation by another thread and vice versa
        // it can store only one element, capacity at most one element

    }
}
