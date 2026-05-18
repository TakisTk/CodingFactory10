package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Η {@link BankApp} παρεχει μια μονο υπηρεσια,
 * την υπηρεσια καταθεσης.
 */
public class BankApp {
    static double balance = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = 0.0;

        try {
            System.out.println("eisagete to poso pou thelete na katathesete");
            amount = scanner.nextDouble();

            deposit(amount);

        } catch (Exception e) {
            System.out.println("η καταθεση απετυχε");
        }



    }

    public static void deposit(double amount) throws Exception {
        try{
            if (amount < 0) throw new Exception("Το ποσο δεν μπορει να ειναι αρνητικο");
            balance += amount;


        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw e;     // rethrow
        }


    }
}
