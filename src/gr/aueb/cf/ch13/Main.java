package gr.aueb.cf.ch13;

public class Main {

    static void main() {
        // Δημιουργία αντικειμένου Point μέσω της static factory method
        OnlyOneCodingFactory onlyOneCodingFactory = OnlyOneCodingFactory.getInstance();
        onlyOneCodingFactory.doSomething();

        //Καλούμε την υπηρεσία της utility class
        HelloUtil.sayHello();
    }
}
