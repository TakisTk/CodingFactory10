package gr.aueb.cf.ch17.lifo_parking;

import java.time.LocalDateTime;
import java.util.*;

public class LifoParking {
    private final Deque<String> parking = new LinkedList<>(); //mutable

    public LifoParking() {

    }

    public List<String> getParking() {
        return List.copyOf(parking); // unmodifiable copy
    }

    public void addCar(String car) {
        parking.push(car);
        System.out.println(LocalDateTime.now() + ", Plate Number: " + car + " added to parking.");
    }

    public String removeCar() {
        if (parking.isEmpty()) {
            System.out.println(LocalDateTime.now() + ", Parking is empty. No car to remove.");
            return null;
        }
       String car = parking.pop();
        System.out.println(LocalDateTime.now() + ", Plate Number: " + car + " removed from parking.");
        return car;
    }

    public boolean isEmpty() {
        return parking.isEmpty();
    }

    public int size() {
        return parking.size();
    }

    public void traverse() {
        parking.forEach(System.out::println);
    }
}
