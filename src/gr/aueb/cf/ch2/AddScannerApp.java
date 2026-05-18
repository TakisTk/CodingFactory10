package gr.aueb.cf.ch2;


import java.util.Scanner;

/**
 * Scanner Demo / διαβαζει 2 ακαιρεουσ απο το στανταρ ινπουτ και υπολογιζει το αρθροισμα και το εκτυπωνει
 */
public class AddScannerApp {
    public static void main(String[] args) {
        //δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        //data input και αντιστοιχιση σε μεταβλητες( data binding
        System.out.println("παρακαλω εισαγετε δυο ακεραιουσ:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();


        // λογικη εφαρμογησ

        sum = num1 + num2;

        System.out.printf("το αρθροισμα των %d και %d ειναι %d\n", num1, num2, sum);


    }
}
