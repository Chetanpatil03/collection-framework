import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bread");
        list.add("Milk");
        list.add("Butter");

        for (String string : list) {
            System.out.println(string);
            if (string.equals("Milk")) {
                //groceries.add("Eggs"); // this will give the ConcurrentModificationException
                continue;
            }
        }

        System.out.println("Updated grocery List :"+list);

        // CopyOnWriteArraylist example -- while handling the read and write operations


        CopyOnWriteArrayList<String> groceries = new CopyOnWriteArrayList<>();
        groceries.add("Bread");
        groceries.add("Milk");
        groceries.add("Butter");

        for (String string : groceries) {
            System.out.println(string);
            if (string.equals("Milk")) {
                groceries.add("Eggs"); // this will execute successfully
                continue;
            }
        }

        System.out.println("Updated grocery List :"+groceries);

        
    }
}
