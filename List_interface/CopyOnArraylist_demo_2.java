import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArraylist_demo_2 {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<>();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");

        Thread readerThread = new Thread(()->{
            try {
                while (true) {
                    //iterate through the list 
                    for (String string : list) {
                        System.out.println("Reading item : "+string);
                        Thread.sleep(100); //small delay to simulate work
                    }
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Exception in reader thread");
            }
        });

        Thread writertThread = new Thread(()->{
            try {
                Thread.sleep(500);
                list.add("Item 5 ");
                System.out.println("Added item 5 into the list");
                
                Thread.sleep(500);
                list.remove("Item 10");
                System.out.println("removed item 1 from the list");
                
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        });

        readerThread.start();
        writertThread.start();
    }
}
