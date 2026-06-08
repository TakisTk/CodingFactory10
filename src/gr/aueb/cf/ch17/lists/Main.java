package gr.aueb.cf.ch17.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    static void main() {
        List<String> cities = new ArrayList<>();

        // Add some cities to the list
        cities.add("Athens");  // index 0
        cities.add("Thessaloniki"); // index 1
        cities.add("Patra"); // index 2

        // Get
        String city = cities.get(0);
        System.out.println(city);

        // Update
        int position = cities.indexOf("Patra");
        if (position != -1) {
            System.out.println("Not found");
        } else {
            cities.set(position, "Larissa");
        }

        // Remove
        if (cities.contains("Larissa")) {
            cities.remove("Larissa");
        } else {
            System.out.println("Not found");
        }

        // Traverse

        // For
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        // Enhanced for
        for (String c : cities) {
            System.out.println(c);
        }

        // Iterator
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            String c = it.next();
            System.out.println(c);
        }

        Iterator<String> it2 = cities.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals("Thessaloniki")) {
                it2.remove();
            }
        }

        cities.forEach(c -> System.out.println(c));
        cities.removeIf(c -> c.equals("Patra"));
    }
}
