package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int result = 0;

        System.out.println("dwste enan thetiko akereo: ");
        n = in.nextInt();

        result = facto(n);

        System.out.printf("to paragontiko tou " + n + " einai: " + result);
    }

    /**
     * calculates factorial of n
     *
     * @param n     the number to calculate factorial for
     * @return      the factorial of n
     */
    public static int facto(int n){
        int result = 1;

        for(int i = 1; i <= n; i++){
            result *=i;
        }

        return result;
    }
}
