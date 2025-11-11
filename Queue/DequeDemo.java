package Queue;

public class DequeDemo {
    public static void main(String[] args) {
        // Deque --> Double ended Queue
        // insertion and deletion of elements from both the end
        // versatile than regular queues and stack because they support all operations of both

        // Insertion method :: 

        /*
         * addFirst(E e) : Insert the specified element at the front
         * addLast(E e) : Insert the specified element at the last
         * -- both will throw the exception
         * offerFirst(E e) : Insert the specified element at the front if possible --else false
         * offerlast(E e) : Insert the specified element at the front if possible --else false
         * 
         */

        /*  Removel Methods
         *  removeFirst() :: retrives and removes the front element
         *  removeLast() :: retrives and removes the last element
         *  pollFirst() :: retrives and removes the front element, or return null if queue is empty
         *  pollLast() :: retrives and removes the last element, or return null if queue is empty
         */

        //  Retrieval Methods
        /*
         * getFirst() :: Retrieves, but does not remove front element
         * getLast() :: Retrieves, but does not remove last element
         * -- can throw exception
         * peekFirst() :: Retrieves, but does not remove first element or return null if empty
         * peekLast() :: Retrieves, but does not remove last element or return null if empty
         */

        //  Stack methods :: 
        /*
         * push(E e) :: add element at the front equivalent to addFirst()
         * pop() :: removes and return the first element equivalent to removeFirst()
         */
    }
}
