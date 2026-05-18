package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * o xristis prospathei na mantepsei enan mistiko akereo
 */
public class SecretApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 12; //mystikos akereos
        int guess = 0;

        System.out.println("prospathiste na mantepsete ton mistiko akereo:");
        guess = scanner.nextInt();

        if (guess == SECRET) {
            System.out.println("congratulations you guessed right");
        } else {
            System.out.println("o arithmos einai lathos.");
        }
    }
}
