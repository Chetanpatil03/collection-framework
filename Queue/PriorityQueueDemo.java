package Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //Part of Queue interface
        // Orders elements based on their natural ordering(for primitives lowest first)
        // Custom Comparator for customized Sorting / odering (user defined classes--> Comparable(implements))
        // if not then it also provide the Comparator
        // NOTE : it does not allows duplicate elements.

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(57);
        priorityQueue.add(37);
        priorityQueue.add(16);
        priorityQueue.add(4);
        priorityQueue.add(31);
        priorityQueue.add(9);

        System.out.println("Priority Queue :: "+priorityQueue);
        System.out.println("Priority :: "+priorityQueue.peek());
        priorityQueue.remove();
        System.out.println("Priority Queue :: "+priorityQueue);
        System.out.println("Priority :: "+priorityQueue.peek());

        while (!priorityQueue.isEmpty()) {
            System.out.println("Priority :: "+priorityQueue.poll());
        }
    }
}
