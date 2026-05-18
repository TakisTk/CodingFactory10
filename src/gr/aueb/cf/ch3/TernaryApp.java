package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TernaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("enter 2 numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

//        if ( num1 < num2){
//            min = num1;
//        }
//        else {
//            min = num2;
//        }
        min = num1 < num2 ? num1 : num2;

        System.out.println("smallest number between " + num1 + " and " + num2 + " is: " + min);

    }
}
