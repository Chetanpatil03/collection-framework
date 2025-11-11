package Sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_one {

    public static void main(String[] args) {
        // Sets are collection of unique elememt --> it can not consist duplicates
        // based on hashmaps principle so faster execution
        // insertion --> O(1)
        // finding --> O(1)

        // Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
        // Set --> HashSet, LinkedHashSet, TreeSet, EnumSet

        // Set<Integer> set = new HashSet<>(); --> unordered
        // Set<Integer> set = new LinkedHashSet<>(); // --> insertion order
        Set<Integer> set = new TreeSet<>(); //---> natural sorted manner
        
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        Set<Integer> keySet = hashMap.keySet(); // --> return unique keys 

        set.add(14);
        set.add(37);
        set.add(14); // --> take only one
        set.add(16);
        set.add(19);

        // System.out.println("HashSet :: "+set); //--> unorder set
        // System.out.println("LinkedHashSet :: "+set); //--> insertion order set
        System.out.println("Tree set :: "+set); //---> natural sorted manner

        // have method  --> add(),addAll(), remove(), size(), contains(), containsAll(), clear() etc.

        
    }
}