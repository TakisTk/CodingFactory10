package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * metraei to plithos twn thetikvn akairevn pou dinei o xristis kai stamataei otan
 * o xristis dwsei enan arnitiko
 */

public class PositivesCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("insert a number: (negative for out)");
        num = scanner.nextInt();

        while (num >= 0){
            positivesCount++;
            System.out.println("insert a number: (negative for out)");
            num = scanner.nextInt();
        }

        System.out.println("to plithos twn thetikwn einai: " + positivesCount);
    }
}
