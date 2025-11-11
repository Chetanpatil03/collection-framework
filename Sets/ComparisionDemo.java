package Sets;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class ComparisionDemo {

    public static void main(String[] args) {
        // CopyOnWriteSet
        // --> other set implementations are not thread safe -- hashset, treeset, enumset etc,
        // they have the problem of --> concurrent thread and concurrentmodification exception

        // to avoid these kind of problems CopyOnWriteArraySet is being used

        // features
        // --> thread safe, copy-on-write mechanism, no duplicate elements, iterators do not effect modification

        //  for thread safety there is also an alternative --> ConcurrentSkipListset
        // both have different use cases-->

        Set<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        Set<Integer> skipListSet = new ConcurrentSkipListSet<>();

        for(int i=1; i<=5; i++){
            copyOnWriteArraySet.add(i);
            skipListSet.add(i);
        }

        System.out.println("CopyOnWriteArraySet :: "+copyOnWriteArraySet);
        System.out.println("ConcurrentSkipListSet :: "+skipListSet);

        System.out.println("\nIterating and modifying CopyOnWriteArraySet :: ");
        for (Integer i : copyOnWriteArraySet) {
            System.out.println("Reading from CopyOnWriteArraySet :: "+i);
            // attempting to modify the set during the iteration

            copyOnWriteArraySet.add(6); //--> added after iteration completion

        }
        // iteration happing on pre-image/photo
        // in this way we can call it consistent
        System.out.println("\nAfter iteration of CopyOnWriteArraySet :: "+copyOnWriteArraySet);
        
        
        System.out.println("\n\nIterating and modifying ConcurrentSkipListSet :: ");
        for (Integer i : skipListSet) {
            System.out.println("Reading from ConcurrentSkipListSet :: "+i);
            // attempting to modify the set during the iteration
            
            skipListSet.add(6); //--> added during iteration 
            // it will going to print

            // ex. if we add this in last iteration this will not add 
            // this will create inconsistency.
            if (i == 5) {
                // skipListSet.add(6); //--> not added during iteration --> added after
            }
            
        }
        // ConcurrentSkipListSet is weakly consistent
        // cause we dont have confirmation if this going to added or not

        System.out.println("\nAfter iteration of ConcurrentSkipListSet :: "+skipListSet);


        // use cases :: 
        // CopyOnWriteArraySet --> 
            // not for higher number of writes (memory consume)
            // suitable for read intensive tasks 
            // provides stability for reading

        // ConcurrentSkipListSet --> 
            // suitble for frequent writes and reads

    }
}