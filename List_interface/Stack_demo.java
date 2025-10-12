import java.util.LinkedList;
import java.util.Stack;

public class Stack_demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10); //top 1
        stack.push(20); //top 2
        stack.push(30); //top 3
        stack.push(40); //top 4

        System.out.println(stack);
        System.out.println(stack.peek());
        // System.out.println);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());

        // other methods that are present in Vector class in java
        // -- add,remove,index,search, etc
        stack.add(10);
        System.out.println(stack);

        // we can also implement this by LinkedList class
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(10);
        linkedList.addLast(20); //push at top > 
        linkedList.addLast(30);
        linkedList.addLast(40);

        System.out.println(linkedList.getLast()); //peek
        linkedList.removeLast();// pop 

        // when to which 
        // LinkedList -->> when there is not need of sysnchronization and the environment is single threaded
        // Stack -->> when there is need of sysnchronization and the environment is multi threaded

    }

    // Stack is linear datastructure which extends Vector class in java
    // Stack follows LIFO Last In First Out principle
    // stack have methods like -> 
    // 1. Push ->> Add element at top
    // 2. Pop ->> Remove elemenet from top
    // 3. Peek ->> Get element from top 
    // 4. isEmpty ->> checks if stack is empty
    // 5. size ->> return size of stack 
    // etc all the methods of Vector class because it extends the vector class.
}
