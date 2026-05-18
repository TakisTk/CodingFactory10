package gr.aueb.cf.ch1;

/**
 * Adds two integers and prints
 * the result to the console.
 */

public class AddApp {

    public static void main(String[] args) {
        // Δηλωση και αρχηκοποιηση μεταβλητων
        int num1 = 5;
        int num2 = 12;
        int result = 0;


        //Λογικη - Εντολες
        result = num1 + num2;

        //εκτυπωση αποτελεσματος
        System.out.println("Το αποτελεσμα ειναι: " + result);
        System.out.println("το αρθροισμα των " + num1 + " και " + num2 + " ειναι: " + result);
        System.out.printf("το αρθροισμα των %d και %d ειναι: %d\n", num1, num2, result);
    }
}
