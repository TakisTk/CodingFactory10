package gr.aueb.cf.ch3;


import java.util.Scanner;

public class SecretIterativeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 12;
        int guess = 0;

        while (true) {
            System.out.println("prospathiste na mantepsete ton arithmo: ");
            guess = scanner.nextInt();

            if (guess != SECRET) {
                System.out.println("wrong");
                continue;
            }

            System.out.println("correct");
            break;

//            if (guess == SECRET) {
//                System.out.println("suxaritiria to vrikate");
//                break;
//            }else {
//                System.out.println("prospathiste ksana");
//            }
        }
    }
}
