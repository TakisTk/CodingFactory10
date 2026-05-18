package gr.aueb.cf.ch5;

/**
 *οριζει μια μεθοδο swap void swap(int a, int b) n
 * οποια εχει στοχο να ανταλαξει αμοιβαια τισ τιμες
 * των a, b.
 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("prin to swap einai: a = %d, b = %d\n", a , b);

        swap(a, b);

        System.out.printf("meta to swap einai: a = %d, b = %d\n", a, b);

    }
    public static void swap(int a, int b) {
        int tmp  = a;
        a = b;
        b = tmp;
    }
}
