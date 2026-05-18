package gr.aueb.cf.ch4;

import java.util.Scanner;

public class ForeverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        final int MAX_COUNT = 100;


        for(;;) {
            System.out.print("Forever");
            count++;
            if (count % 10 == 0){
                System.out.println();

            if (count == MAX_COUNT) {
                break;


                }
            }
        }
    }
}