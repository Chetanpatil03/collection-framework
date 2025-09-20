import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class IntegerComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        //for descending order
        return o2 - o1;
    }

    /*
     * if we want to return the o1 object first so compare function should return negative value 
     * o1  o2
     * 5   3  it returns positive so it will o2 then o1
     * 2   3  it returns negative so it will o1 then o2
     * 2   2  return zero so not needed.
     * 
     * 
     * same logic for descemding order
     * 
     */
}

public class useOfComparator {
    public static void main(String[] args) {
        ArrayList<Integer> listIntegers = new ArrayList<>();
        listIntegers.add(15);
        listIntegers.add(25);
        listIntegers.add(4);
        listIntegers.add(67);
        listIntegers.add(7);

        System.out.println(listIntegers);

        System.out.println("Sorting Ascending : ");
        listIntegers.sort(null);
        System.out.println(listIntegers);


        System.out.println("Sorting Descending : ");
        listIntegers.sort(new IntegerComparator());
        System.out.println(listIntegers);


        ArrayList<String> stringsList = new ArrayList<>();
        stringsList.addAll(Arrays.asList("Chetan","Prafulla","Om","Raj"));

        System.out.println(stringsList);

        //sorting list by lambda comparotor

        stringsList.sort((a,b)-> a.length() - b.length());
        System.out.println("Increasing length of words : ");
        System.out.println(stringsList);

        stringsList.sort((a,b)-> b.length() - a.length());
        System.out.println("Decreasing length of words : ");
        System.out.println(stringsList);

        stringsList.sort(null);
        System.out.println("Sorting ascending order");
        System.out.println(stringsList);

        // stringsList.sort((a, b) -> b.compareTo(a)); // descending lexicographical order
        stringsList.sort((a, b) -> b.charAt(0) - a.charAt(0)); // decsecnding order
        System.out.println("Sorting descending lexicographical order");
        System.out.println(stringsList);


    }
}
