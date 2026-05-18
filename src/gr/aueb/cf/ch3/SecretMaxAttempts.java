package gr.aueb.cf.ch3;
/**
 * prospathei na mantepsei enan pin alla
 * me ena orio prospatheiwn. an kseperasei to orio xaneiu
 */

import java.util.Scanner;

public class SecretMaxAttempts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET_PIN = 1234;
        int inputPin = 0;
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;

        while (true){
            if (attempts == MAX_ATTEMPTS){
                System.out.println(" exete kseperasei to orio prospatheiwn. xasate!");
                break;
            }

            System.out.println("prospathiste na mantepsete to PIN. prospatheia " + (attempts + 1 ) + " apo " + MAX_ATTEMPTS);
            inputPin = scanner.nextInt();

            if (inputPin != SECRET_PIN) {
                System.out.println("lathos PIN prospathiste ksana");
                attempts++;
                continue;
            }

            System.out.println("Correct PIN");
            break;
        }


    }
}
