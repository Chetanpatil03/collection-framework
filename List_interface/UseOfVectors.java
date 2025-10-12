import java.util.ArrayList;
import java.util.Vector;

public class UseOfVectors {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Vector<Integer> vector = new Vector<>();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                list.add(10);
                vector.add(10);
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                list.add(10);
                vector.add(10);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        System.out.println("Size of Arraylist : "+list.size());  //the correct output should be 1100 
        // but it is not certain because arraylist is not thredsafe/ not synchronized so the output is unpredicatble.

        System.out.println("Size of Vector : "+vector.size()); // it will give ouput -> 1100
        //the output is constant
    }
}
