package Queue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

        deque.add(1);
        deque.addLast(4); //both are same

        deque.addFirst(8);

        System.out.println("Deque :: "+deque);

        int first = deque.removeFirst();
        int last = deque.removeLast(); //-- same as remove()


    }
}
