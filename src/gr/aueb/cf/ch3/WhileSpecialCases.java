package gr.aueb.cf.ch3;

/**
 * 1. zero iterations
 * 2. one iteration
 * 3. eternal loop
 */
public class WhileSpecialCases {
    public static void main(String[] args) {
        int i = 1;

        //1.
        while (i <= 0) {
            System.out.println(" i = " + 1);
            i++;
        }

        //2.
        while (i <= 1) {
            System.out.println(" i = " + 1);
            i++;
        }

        //3.
        while (true) {
            System.out.println(" it will run forever on loop (eternal loop)");
        }
    }
}
