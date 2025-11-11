package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorDemo {

    public static void main(String[] args) {
        // Iterator is parent interface of all Collectios 
        // --> used to travers the collection like foreach
        // 

        // ex -> 
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Using For each :: ");
        for (Integer i : list) {
            System.out.print(i+" ");
        }

        // internally this will be executed as --> 

        Iterator<Integer> iterator = list.iterator();
        System.out.println("\nUsing Iterator :: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");  
        }

        // Iterator have methods like --> hasNext(), next(), remove()

        // --> we are not able to remove elment while iterating the element in foreach loop of normal list
        // we have to use CopyOnWriteArraylist --> but this also removes the element after completing the iteration/processing

        // ex--> 
        // list.addAll(Arrays.asList(2,4,6,8));

        // CopyOnWriteArrayList<Integer> list2 = new CopyOnWriteArrayList<>();
        // list2.addAll(Arrays.asList(1,2,3,4));
        // for (Integer i : list2) {
        //     if (i % 2 == 0) {
        //         list.remove(Integer.valueOf(i)); // --> throw concurrent modification exception
        //     }
        // }

        // The iterator.remove --> method will remove the element while traversing

        System.out.println("\nRemoving ::: ");

        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            Integer num = iter.next();
            if (num % 2 == 0) {
                System.out.println(iter.next());
            //    iter.remove();
            }
        }

        System.out.println(list);

        // we also have ListIterator --> extends iterator interface
        // --> provide more method specially for lists.
        // --> like : hasPrevious(), nextIndex(), previousIndex(), previous()
        // --> to iterate in reverse manner also

        // --> also we can replace the current element while iterating using --> set

        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            Integer num = listIterator.next();
            if (num % 2 == 0) {
                System.out.println(listIterator.next());
            //    iter.remove();
                listIterator.set(4);
            }
        }

        listIterator.forEachRemaining(System.out::print);

        System.out.println(listIterator);
    }
    
}