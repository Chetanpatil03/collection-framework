package Sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSets {
    // The set in which the elements are unchangeble after defining
    // there are primarily two way to create immutableSets

    public static void main(String[] args) {


        // 1. Set.of() --> can take as many argument as you wanted to add
        Set<Integer> set = Set.of(1,5,7,3,2);

        System.out.println("Set :: "+set);
        // set.add(12); will throw error

        // 2. Collections.unmodifiableSet() --> 

        Set<Integer> unmodifiableSet = Collections.unmodifiableSet(new HashSet<Integer>(Arrays.asList(2,5,4,1,7)));
        System.out.println("Using unmodifiable :: "+unmodifiableSet);

    }

}
