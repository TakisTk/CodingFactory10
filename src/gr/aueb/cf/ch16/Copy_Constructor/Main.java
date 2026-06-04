package gr.aueb.cf.ch16.Copy_Constructor;

public class Main {

    static void main() {
        City athens = new City("Athens");
        City copyAthens = new City(athens);
    }
}
