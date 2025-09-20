import java.lang.reflect.Field;
import java.util.ArrayList;

public class checkArrayCapacity {
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>(11);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

        list.add(1);


        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);

        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

        list.trimToSize();

        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

    }
}
