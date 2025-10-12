import java.util.Vector;

public class Vector_demo {
    public static void main(String[] args) {
        // ways to create vectors in java

        // Vector<Integer> one = new Vector<>();
        // one.add(14);
        // one.add(14);
        // one.add(14);
        // one.add(14);
        // System.out.println(one);

        // Vector<Integer> two = new Vector<>(5);
        // two.add(10);
        // two.add(10);
        // two.add(10);
        // two.add(10);
        // two.add(10);
        // System.out.println(two.capacity());
        // two.add(10);
        // System.out.println(two.capacity()); // 2x the intial size.

        Vector<Integer> two = new Vector<>(5,2);
        two.add(10);
        two.add(10);
        two.add(10);
        two.add(10);
        two.add(10);
        System.out.println(two.capacity());
        two.add(10);
        System.out.println(two.capacity()); // size will be incremented by two only
    }

    // vector was introduced in jdk 1 before the collection framewoks
    // it is part of lagecy class later it was added into collections framework as implementation class of List interface.

    // It is sychronized type of array which provides thread safety in multi-threaded environment.
    // constructors : 
    // 1. Vector() -> basic create vector with defacult capacity
    // 2. Vector(int initalCapacity) -> basic create vector with given initial capacity
    // 3. Vector(int initalCapacity, int capacityIncrement) -> basic create vector with given initial capacity, and capacityIncrement 
    // 4. Vector(Collection<? extends E> c) -> creates the vector with passed collections like ArrayList and LinekdList.

}
