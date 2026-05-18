package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * λαμβανει απο τον χρηστη εναν ακεραιο που αντιστοιχει σε ωρε.
 * Μετα μετατρεπει
 * σε λεπτα και δευτερολεπτα και τα εκτειπωνει.
 */

public class HoursToMinSec {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int HOURS_TO_MINUTES = 60;
        final int HOURS_TO_SECONDS = 3600;
        int inputHours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("παρακαλω εισαγετε τον αριθμο ωρων: ");
        inputHours = scanner.nextInt();

        minutes = inputHours * HOURS_TO_MINUTES;
        seconds = inputHours * HOURS_TO_SECONDS;
        System.out.printf("ωρες: %d, λεπτα: %d, λεπτα: %d", inputHours, minutes, seconds);

    }
}
