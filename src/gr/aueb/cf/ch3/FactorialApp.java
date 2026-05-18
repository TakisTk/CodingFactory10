package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * upologizei to paragontiko toy n (n!)
 * opou to n to eisagei o xristis
 */
public class FactorialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int result = 1;
        int i = 1;

        System.out.println("eisagete enan akereo gia ton upologismo tou n! ");
        n = scanner.nextInt();

        while(i <= n){
            result *= i; // 1 + 2 + 3 + 4...
            i++;
        }
        System.out.printf("%d! = %d\n", n, result);
    }
}
