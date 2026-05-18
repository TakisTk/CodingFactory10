package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * δημιουργειται ενα  {@link ArithmeticException} χωρισ να το χειριστουμε.
 */
public class Arithmetic1App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("παρακαλω εισαιγετε 2 ακεραιους:");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        result = num1 / num2;  //αν num2 == 0 θα δωσει arithmetic exception

        System.out.println(result);
    }
}
