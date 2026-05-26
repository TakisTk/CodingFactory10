package gr.aueb.cf.ch13;

public class OnlyOneCodingFactoryLazy {

    /**
     * Lazy initialization - the instance is created only when it is needed.
     */
    private static OnlyOneCodingFactoryLazy instance; //null

    private OnlyOneCodingFactoryLazy() {
        // private constructor to prevent instantiation
    }

    public static OnlyOneCodingFactoryLazy getInstance() {
        if (instance == null) {
            instance = new OnlyOneCodingFactoryLazy();
        }
        return instance;
    }
}
