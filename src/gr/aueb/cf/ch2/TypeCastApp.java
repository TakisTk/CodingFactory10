package gr.aueb.cf.ch2;

/**
 * Typecast Demo
 */

public class TypeCastApp {
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20L;  // το L ειναι type suffix

        num1 = (int) num2;  //error prone

        System.out.println();
    }
}
