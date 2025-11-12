package Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConcurrentLinkedQueueDemo {
    
    private static ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
    public static void main(String[] args) {
        // BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        Thread producer = new Thread(()->{
            while (true) {
                try{
                    // queue.put("Task :: "+System.currentTimeMillis()); // add task(will use lock internally)

                    queue.add("Task :: "+System.currentTimeMillis()); 
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(()->{
            while (true) {
                try{
                    // String task = queue.take(); // takes taks (use locks internally)
                    String task = queue.poll();
                    System.out.println("Processing :: "+task);
                }catch(Exception e){
                    e.printStackTrace();
                } 
            }
        });


        producer.start();
        consumer.start();

    }
}
