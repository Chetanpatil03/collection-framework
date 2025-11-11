package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        // Queue follows --> First In First Out principle
        // Queue is interface --> implementation classes --> LinkedList, PriorityQueue, ArrayBlockingQueue

        // Implementing Queue by linked list 
        // by methods addFirst and remove last.

        LinkedList<Integer> queue_LinkedList = new LinkedList<>();
        queue_LinkedList.addLast(1); //enqueue
        queue_LinkedList.addLast(2); //enqueue
        queue_LinkedList.addLast(3); //enqueue

        System.out.println("Queue :: "+queue_LinkedList);
        Integer i = queue_LinkedList.removeFirst(); // --> first element //dequeue
        System.out.println("Queue :: "+queue_LinkedList);

        System.out.println(queue_LinkedList.peek()); // --> peek

        // In LinkedList much complexities are present --> like addLast, removeFirst etc
        // So java provide --> Queue interface

        // Queue ==> primary methods
        //  add() ---> offer()
        //  remove() --> poll()
        //  peek() --> element()

        // Comaparision between these methods

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        
        System.out.println(queue.remove()); //--> throws exception if queue is empty ELSE TRUE
        System.out.println(queue.poll()); // returns null of queue is empty else TRUE

        // System.out.println(queue.element()); //--> throws exception if queue is empty
        System.out.println(queue.peek()); //returns null if empty

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        queue2.add(1);
        queue2.offer(1);

        // System.out.println(queue2.add(3)); // --> throws exception if limit reached or fail to add IF ADDED THEN TRUE
        System.out.println(queue2.offer(3)); // --> return TRUE of FALSE 


    }
}
