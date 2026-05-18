package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choise = 0;
        final int EXIT = 5;

        do {
            System.out.println("select option");
            System.out.println("1. show profile");
            System.out.println("2. edit profile");
            System.out.println("3. options");
            System.out.println("4. help");
            System.out.println("5. exit");

            choise = in.nextInt();

//            switch (choise) {
//                case 1:
//                    System.out.println("1. show profile");
//                    break;
//                case 2:
//                    System.out.println("2. edit profile");
//                    break;
//                case 3:
//                    System.out.println("3. options");
//                    break;
//                case 4:
//                    System.out.println("4. help");
//                    break;
//                case EXIT:
//                    System.out.println("5. exit");
//                    break;
//                default:
//                    System.out.println("not valid option try, again");
//            }

            switch (choise) {
                case 1 -> System.out.println("1. show profile");
                case 2 -> System.out.println("2. edit profile");
                case 3 -> System.out.println("3. options");
                case 4 -> System.out.println("4. help");
                case EXIT -> System.out.println("5. exit");
                default -> System.out.println("not valid option try, again");
            }

        }while (choise != EXIT);
    }
}
