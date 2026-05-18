package gr.aueb.cf.ch3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * o xristis eisagei enan akaireo. to programa ipologizei
 * to apolito enws akereou. to apolito enos akereou einai
 * thetikos pada.
 */
public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int abs = 0;

        System.out.println("insert a number: ");
        num1 = scanner.nextInt();

        abs = num1 >= 0 ? num1 :  -num1;

        System.out.println("absolute is: " + abs);


    }


}
