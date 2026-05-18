package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * o xrisrtis eisagei to base kai to power kai to programa ypologizei kai ekteipwnei
 * to base^power
  */

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("eisagete tin bash kai tin dunami ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++ ){
            result *= base;
        }
        System.out.println(result);
    }
}
