import java.util.*;

public class Arraylist_1 {
    public static void main(String[] args) {
        // System.out.println("hello world........");
        //creation of arraylist -- 
        // List<Integer> list = new ArrayList<>();   <Integer> for types safety
        ArrayList<Integer> list = new ArrayList<>(); 

        // adding elements to the list
        list.add(12);
        list.add(15);
        list.add(19);

        // iterating over list
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }

        System.out.println(list.get(2));
        System.out.println(list.contains(124));
        System.out.println(list.contains(12));

        list.add(3,57);
        System.out.println(list);
        list.add(0,1);
        System.out.println(list);
        list.set(2, 14);
        System.out.println(list);

        list.forEach(item -> System.out.print(item+" "));

        // System.out.println(list.sort());

        


    }
    
}