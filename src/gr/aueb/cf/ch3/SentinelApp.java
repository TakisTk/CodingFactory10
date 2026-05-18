package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * diavazei apo ton xristi akereous
 * mexri na dwthei -1(sentinel)
 */
public class SentinelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("insert a number(-1 for exit): ");
        while ((num = scanner.nextInt()) != -1){
            iterations++;
            System.out.println("insert a number(-1 for exit): ");
        }
        System.out.println("user used " + iterations + " numbers before sentinel number (-1)");
    }
}
