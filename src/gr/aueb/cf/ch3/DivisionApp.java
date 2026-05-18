package gr.aueb.cf.ch3;

import java.util.Scanner;


/**
 * epitepei ston xristei na eisagei arithmiti kai paronomasti
 * kai na ektelei tin dieresi
 */

public class DivisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("eisagete ton arithmiti: (eksodos me 0)");
            numerator = scanner.nextInt();
            if ( numerator == 0) {
                System.out.println("eksodos apo to programa");
                break;
            }
            System.out.println("eisagete ton paronomasti");
            denominator = scanner.nextInt();
            if ( denominator == 0) {
                System.out.println("o paronomastis den mporei na einai 0. prospathiste ksana");
                continue;
            }

            result = numerator / denominator;
            System.out.println(" to apotelesma tis dieresis " + numerator + " / " + denominator + " einai: " + result);

        }
        System.out.println("euxaristoume pou xrisimopiisate to programa");

    }
}
