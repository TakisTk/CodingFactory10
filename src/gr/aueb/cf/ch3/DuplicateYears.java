package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DuplicateYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        while (true) {
            System.out.println("insert the year: ");
            year = scanner.nextInt();

            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println("to etos einai disekto");

            } else if (year % 400 == 0) {
                System.out.println("to etos einai disekto");

            } else {
                System.out.println("to etos den einai disekto");



            }
        }
    }
}
