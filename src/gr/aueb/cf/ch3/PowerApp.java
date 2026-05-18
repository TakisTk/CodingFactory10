package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * upologizei to a^n. o xristis eisagei ta a kai ta n
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println(" parakalw eisagete tin vasi (a) ");
        base = scanner.nextInt();
        System.out.println(" parakalw eisagete tin dynami (n) ");
        power = scanner.nextInt();

        while(i <= power) {
            result *= base;
            i++;
        }
        System.out.printf("%d ^ %d = %d\n", base, power, result);


    }
}
