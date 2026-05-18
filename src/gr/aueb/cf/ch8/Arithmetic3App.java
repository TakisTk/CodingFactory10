package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Arithmetic3App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("εισαγετε 2 ακεραιους: ");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if (num2 == 0) {       //state test
            System.out.println("δεν επιτρεπετε διαιρεση με το 0");
        } else {
            result = num1 / num2;
            System.out.println("το αποτελεσμα ειναι: " + result);
        }
    }
}
