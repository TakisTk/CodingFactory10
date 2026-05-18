package gr.aueb.cf.ch4;

public class CharApp {
    public static void main(String[] args) {
        char char1 = 'A';
        char char2 = '*';
        char char3 = ' ';

        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        System.out.println("char3 = '" + char3 + "' (space character)");


        System.out.printf("char1: %c, ordinal = %d\n", char1, (int) char1);
        System.out.printf("char1: %c, ordinal = %d\n", char2, (int) char2);
        System.out.printf("char1: %c, ordinal = %d\n", char3, (int) char3);
    }
}
