package gr.aueb.cf.ch13;

public class Main {

    static void main() {
        OnlyOneCodingFactory onlyOneCodingFactory = OnlyOneCodingFactory.getInstance();
        onlyOneCodingFactory.doSomething();

        //Καλούμε την υπηρεσία της utility class
        HelloUtil.sayHello();
    }
}
