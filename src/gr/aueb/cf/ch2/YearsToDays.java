package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * ο χρησυησ εισαγει την ηληκια του σε ετη και το προγραμα επιστρεφει την ηληκια σε ημερεσ
 */

public class YearsToDays {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        int inputAgeInYears = 0;
        int ageInDays = 0;
        final int DAYS_IN_YEAR = 365;

        System.out.println("παρακαλω εισαγετε την ηληκια σας σε ετη");
        inputAgeInYears = scanner.nextInt();

        ageInDays = inputAgeInYears * DAYS_IN_YEAR;

        System.out.printf("ηληκια σε ετη: %d, ηληκια σε μερεσ: %d\n", inputAgeInYears, ageInDays);
    }
}
