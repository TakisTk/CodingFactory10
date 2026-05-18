package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * emfanizei ena menu epilogwn
 * mexri o xristis na epileksei 0 (exit)
 */
public class DoMenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choise = 0;

        do {
            System.out.println("parakalv epilekste tis parakatw epologes:");
            System.out.println("1. eisagwgi proiontos");
            System.out.println("2. enimerosi proiontos");
            System.out.println("3. diagrafi proiontos");
            System.out.println("4. anazitisi proiontos");
            System.out.println("5. diagrafi proiontos");
            choise = scanner.nextInt();
        }while (choise != 5);

        System.out.println("euxaristoume gia tin epilogi tis efargogis mas.");
    }
}
