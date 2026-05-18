package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * o xristis eisagei enan thetiko akaireo kai to
 * programa emfanizei se orizontia diataksi osa asterakika
 */
public class StarsFlex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int n = 0;

        System.out.println("παρακαλω εισαγετε εναν θετικο ακεραιο");
        n = in.nextInt();
        while (i <= n) {
            System.out.println("*");
            i++;
        }



    }
}
