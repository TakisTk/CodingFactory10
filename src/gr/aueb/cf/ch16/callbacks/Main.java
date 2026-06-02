package gr.aueb.cf.ch16.callbacks;

public class Main {
    static void main() {
        IPrintable printable = new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello from the anonymous class!");
            }
        };

        IPrintable printable2 = () -> System.out.println("Hello from the lambda expression!");

        doPrint(new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello from the anonymous class in doPrint!");
            }
        });

        doPrint(() -> sayHello());
        doPrint(Main::sayHello);
    }


    public static void doPrint(IPrintable printable) {
        printable.print();
    }

    public static void sayHello() {
        System.out.println("Hello from the static method!");
    }
}
