package Map_interface;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.MONDAY, "walk");
        map.put(Day.SUNDAY, "leg day");
        map.put(Day.THURSDAY, "gyn");

        System.out.println(map);
        String s = map.get(Day.MONDAY);

        System.out.println(s);
    }
}

enum Day{
    MONDAY, TUESDAY, WEDNSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}