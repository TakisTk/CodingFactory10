package gr.aueb.cf.ch13;

public class OnlyOneCodingFactory {

    // Eager initialization - the instance is created when the class is loaded.
    private final static OnlyOneCodingFactory INSTANCE = new OnlyOneCodingFactory();

    private OnlyOneCodingFactory() {
        // private constructor to prevent instantiation
    }

    public static OnlyOneCodingFactory getInstance() {
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("Say Hello");
    }
}
