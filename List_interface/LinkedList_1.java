import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList_1 {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Chetan");
        ll.add("Chetan");
        ll.add("Chetan");
        ll.add("Chetan");
        ll.add("Chetan");
        ll.add("Chetan");

        ll.addAll(Arrays.asList("prafull","dipak"));

        ll.addFirst("Mr");
        ll.addLast("Kandre");

        
        
        
        System.out.println(ll);
        
        ll.remove("ch");
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
        ll.removeIf(x -> x.length() > 5);

        // ll.removeAll();
    }

}