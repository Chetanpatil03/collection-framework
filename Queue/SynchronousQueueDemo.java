package Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new SynchronousQueue<>();

        Thread producer = new Thread(()->{
            try{
                System.out.println("Producer is waiting to transfer......");
                queue.put("Hello from producer");
                System.out.println("Producer has transfered the message");
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Producer was interrupted...");
            }

        });

        Thread consumer = new Thread(()->{
            try{
                System.out.println("Consumer is waiting to transfer......");
                String messeage = queue.take();
                System.out.println("Consumer recieved :: "+messeage);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Consumer was interrupted...");
            }
        });

        producer.start();
        consumer.start();
    }
}