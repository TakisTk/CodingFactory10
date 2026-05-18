package gr.aueb.cf.ch2;

/**
 * εμφανιζει MIN, Max και ευρωσ τιμων των βασικων τυπων ακεραιων
 */

public class IntApp {

    public static void main(String[] args) {
        System.out.printf("int :MIN = %d, MAX = %d, SIZE = %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.SIZE);
        System.out.printf("Short: MIN = %d, MAX = %d, SIZE = %d\n", Short.MIN_VALUE, Short.MAX_VALUE, Short.SIZE);
        System.out.printf("Byte: MIN = %d, MAX = %d, SIZE = %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.SIZE);
        System.out.printf("Long: MIN = %d, MAX = %d, SIZE = %d\n", Long.MIN_VALUE, Long.MAX_VALUE, Long.SIZE);
    }
}
