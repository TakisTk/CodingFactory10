package gr.aueb.cf.ch8;

/**
 * NullPointer Exception the most popular!
 */
public class NpeApp {

    public static void main(String[] args) {
        String s;

        s = getOneOrNull();

        if ( s == null) {
            System.out.println("Το String ειναι null");
        } else {
            System.out.println(s.length());
        }
        System.out.println(s.length());
    }

    public static String getOneOrNull() {
        return null;
    }
}
