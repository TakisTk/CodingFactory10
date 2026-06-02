package gr.aueb.cf.ch15.special_interfaces;

public class Main {

    static void main() {
        IProduct book = new Book();
        CompactDisc cd = new CompactDisc();

        deliver(book);
        deliver(cd);
    }

    public static void deliver (IProduct product) {
        if (product instanceof Book) {
            System.out.println("Delivering a book...");
        } else if (product instanceof CompactDisc) {
            System.out.println("Delivering a CD...");
        } else {
            throw new IllegalArgumentException("Invalid product type");
        }
    }


}
