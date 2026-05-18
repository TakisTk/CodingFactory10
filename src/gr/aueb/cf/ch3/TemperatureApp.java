package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * o xristis eisagei enan akaireo pou sumbolizei thermokrasia
 * kai to programa upologizei an i thermokrasia
 * einai <0 mia metavliti estv istempbellowzero ginete true aliws false.
 */

public class TemperatureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputTemperature = 0;
        boolean isTempBelowZero = false;

        System.out.println("please insert temperature: ");
        inputTemperature = scanner.nextInt();

        isTempBelowZero = inputTemperature < 0;

        System.out.println("temperature is below zero: " +isTempBelowZero);
    }
}
