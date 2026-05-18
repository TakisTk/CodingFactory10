package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * enalaktika tis do while me while true kai break
 */
public class DoMenu2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise = 0;

        while (true) {
            System.out.println("parakalv epilekste tis parakatw epologes:");
            System.out.println("1. eisagwgi proiontos");
            System.out.println("2. enimerosi proiontos");
            System.out.println("3. diagrafi proiontos");
            System.out.println("4. anazitisi proiontos");
            System.out.println("5. diagrafi proiontos");
            choise = scanner.nextInt();

            if (choise == 5) break;
        }
        System.out.println("euxaristoume gia tin epilogi tis efargogis mas.");
    }
}
