package gr.aueb.cf.ch3;

import java.util.Scanner;

public class multipleIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise = 0;

        do {
            System.out.println("select option: ");
            System.out.println("1. show profile");
            System.out.println("2. edit profile");
            System.out.println("3. options");
            System.out.println("4. help");
            System.out.println("5. exit");

            choise = scanner.nextInt();

            if (choise == 1) {
                System.out.println("show profile...");
            } else if (choise == 2) {
                System.out.println("edit profile..");
            } else if (choise == 3) {
                System.out.println("options...");
            } else if (choise == 4) {
                System.out.println("help...");
            } else if (choise == 5) {
                System.out.println("exit...");
            }
        }
        while (choise != 5);
    }
}