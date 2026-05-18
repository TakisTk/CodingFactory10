package gr.aueb.cf.ch5;

import java.util.Scanner;

public class RoundingDoubles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double area = 0.0;
        double roundedArea = 0.0;
        double truncatedArea = 0.0;

        System.out.println("δωστε την εκταση με 6 δεκαδικα ψηφια: ");
        area = in.nextDouble();


        roundedArea = Math.round(area * 100.0) / 100.0;

        truncatedArea = (int) (area * 100.0) / 100.0;

        System.out.printf("ektasi (arxiki): %.6f\n", area);
        System.out.printf("ektasi(rounded): %.2f\n", roundedArea);
        System.out.printf("ektasi (apokomeni): %.2f\n", truncatedArea);
    }
}
