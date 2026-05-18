package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * se ena xvro stathmeusis i prwti wra kostizei 2 evrw (200 lepta)
 * kai kathe epiplewn wra kostizei 1.5 evrw(150 lepta)
 *
 * o xristis eisagei tis wres pou stathmeuse kai epistrefei to sunoliko kostos
 *
 * an eisagei 5 wres tote to kostos einai
 */

public class ParkingApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputHours = 0;
        int euros = 0;
        int cents = 0;
        int totalCostInCents = 0;
        final int FIRST_HOUR_PRICE = 200;
        final int EACH_ADDITIONAL_HOUR_COST = 150;

        System.out.println("insert hours: ");
        inputHours = scanner.nextInt();


        totalCostInCents = FIRST_HOUR_PRICE + (inputHours - 1) * EACH_ADDITIONAL_HOUR_COST;
        euros = totalCostInCents / 100;
        cents = totalCostInCents % 100;
        System.out.printf("total cost is %d euros and %d cents.\n", euros, cents);
    }


}
