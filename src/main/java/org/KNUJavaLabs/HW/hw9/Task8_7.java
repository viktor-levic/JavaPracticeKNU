package org.KNUJavaLabs.HW.hw9;

import java.util.ArrayList;
import java.util.List;

public class Task8_7 {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Prospect("Shevchenka"));
        items.add(new Square(null));
        items.add(new Street("Lomonosova"));
        items.add(new Square("Lybidska"));
        items.add(new Prospect("Stepana Bandery"));

        City city = new City(items);
        city.seeInformation();
    }
}
