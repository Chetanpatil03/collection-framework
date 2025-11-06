package Map_interface;

import java.util.TreeMap;

public class TreeMapDemo {
    /**
     * Demonstrates creating and using a java.util.TreeMap to store Integer→String mappings
     * and printing the entries in key-sorted order.
     *
     * Behavior:
     * - The implementation used by TreeMap is a Red-Black tree (a self-balancing binary search tree),
     *   so keys are stored in sorted order (natural ordering of the keys or by a supplied Comparator).
     * - Common operations such as put, get, remove and containsKey run in O(log n) time.
     * - Iteration over the map's entrySet/keys/values reflects ascending key order.
     * - TreeMap implements NavigableMap and SortedMap and provides useful navigation methods
     *   (firstKey, lastKey, headMap, tailMap, subMap, lowerKey/higherKey, etc.).
     *
     * Important notes / caveats:
     * - Keys must be mutually comparable: either provide a Comparator at construction time
     *   or ensure keys implement Comparable consistently. Otherwise ClassCastException may be thrown.
     * - When using natural ordering (no Comparator), inserting a null key will throw NullPointerException.
     *   (TreeMap allows null values but not null keys in the natural-order case.)
     * - TreeMap is not synchronized; if multiple threads access it concurrently and at least one
     *   thread modifies it, external synchronization is required.
     * - Iterators returned by TreeMap are fail-fast: they throw ConcurrentModificationException
     *   if the map is structurally modified after the iterator is created (except through the iterator).
     *
     * Example effect of this main:
     * - Inserts several Integer→String entries; because Integer uses natural ascending order,
     *   printing the map will show entries sorted by key (ascending).
     *
     * @param args command-line arguments passed to main (unused)
     * @throws NullPointerException if a null key is inserted when using natural ordering
     * @see java.util.TreeMap
     * @see java.util.NavigableMap
     */
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(3, "Nikhil");
        map.put(4, "Dipak");
        map.put(1, "Chetan");
        map.put(2, "Prafull");

        System.out.println(map);

        // uses internary ---> Red Black Tree
        //  Self balancing tree --> o(log n)
        // O(log n) --> map.put and map.get


    }
}
