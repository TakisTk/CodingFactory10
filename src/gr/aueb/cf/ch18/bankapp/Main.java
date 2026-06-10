package gr.aueb.cf.ch18.bankapp;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    static void main() {
        String option;
        String iban;
        BigDecimal balance;

        while (true) {
            printMenu();
            option = scanner.nextLine().trim();

            try {
                switch (option){
                    case "1" -> {
                        System.out.println("Παρακαλώ εισάγετε το IBAN");
                        iban = scanner.nextLine().trim();
                        System.out.print("Παρακαλώ εισάγετε το αρχικό υπόλοιπο");
                        balance = new BigDecimal(scanner.nextLine().trim());

                        //AcountReadOnlyDTO readOnlyDTO = accountControler.createNewAccount(iban, balance);


                    }


                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


    }


    private static void printMenu() {
        System.out.println("\n=======================");
        System.out.println("|     Υτηρεσία Bank App    |");
        System.out.println("=======================");
        System.out.println("Υποσύστημα Τράπεζας");
        System.out.println("1. Δημιουργία / Ενημέρωση λογαριασμού");
        System.out.println("2. Προβολή λογαριασμών");
        System.out.println("Υποσύστημα Πελατών");
        System.out.println("3. Κατάθεση");
        System.out.println("4. Ανάληψη");
        System.out.println("5. Ερώτηση Υπολοίπου");
        System.out.println("[Εe] Έξοδος");
        System.out.println("Παρακαλώ επιλέξτε μια επιλογή:");
    }
}

