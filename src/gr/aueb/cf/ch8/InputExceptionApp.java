package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * to {@link java.util.InputMismatchException} δημιουργειται οταν προσπαθουμε να εισαγουμε
 * εναν διαφορετικο τυπο δεδομενων απο αυτο που περιμενουμε.
 */
public class InputExceptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("παρακαλω εισαγετε εναν ακεραιο");
//        num = scanner.nextInt();
        if (!scanner.hasNextInt()){         //state test
            System.out.println("den eisagate akeraio");
        } else {
            num = scanner.nextInt();
        }

        System.out.println("o akaireos pou eisagate einai: " + num);
    }
}
