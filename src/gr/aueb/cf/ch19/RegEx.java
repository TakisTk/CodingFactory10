package gr.aueb.cf.ch19;

public class RegEx {
    static void main() {

    }

    public static boolean isHello(String s) {
        return s.matches("Hello");

    }

    public static boolean isHelloOrHi(String s) {
        return s.matches("Hello|Hi");
    }

    public static boolean isHhello(String s) {
        return s.matches("Hh]ello");
    }

    public static boolean starsWithUpperCase(String s) {
        return  s.matches("[A-Z]coding");
    }

    public static boolean startsWithLetter(String s) {
        return s.matches("[a-zA-Z0-9_]coding");
    }

}
