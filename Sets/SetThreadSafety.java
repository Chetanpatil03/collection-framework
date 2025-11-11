package Sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetThreadSafety {
    public static void main(String[] args) {
        // can create using Collections.synchronizedSet(set)
        // --> wrapped the elements, function and operation in a box
        // more complext --> that's why not recommended 

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,57,9,6,7,5,9));
        
        Set<Integer> syncSet = Collections.synchronizedSet(set);

        synchronized(syncSet){
            for (Integer i : syncSet) {
                System.out.println(i);
            }
        } 
        // wrapped manually synchronized 

        // better option --> 
        // ConcurrentSkipListSet --> inbuilt thread safety 
        // <-- implements navigableSet

        Set<Integer> conSet = new ConcurrentSkipListSet<>(set);
        System.out.println("ConcurrentSkipListSet :: ");
        for (Integer i : conSet) {
            System.out.print(i+" ");
        }


    }
}