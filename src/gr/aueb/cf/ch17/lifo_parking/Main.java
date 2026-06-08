package gr.aueb.cf.ch17.lifo_parking;

public class Main {

    static void main() {
        LifoParking lifoParking = new LifoParking();

        lifoParking.addCar("IAE 2323");
        lifoParking.addCar("IAE 2324");
        lifoParking.addCar("IAE 2325");

        String car = lifoParking.removeCar();
//        System.out.println(car);

        car = lifoParking.removeCar();
//        System.out.println(car);

        lifoParking.traverse();

    }
}
