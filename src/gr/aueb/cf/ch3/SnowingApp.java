package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * o xristis eisagei an vrexei kai tin thermokrasia kai to programna upologizei an xiuonizei.
 * an xionizei simenei oti einai katv apo 0 i thermokrasia
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println(" raining? (true/false)");
        isRaining = scanner.nextBoolean();

        System.out.println("insert temperature: ");
        temperature = scanner.nextInt();

        isSnowing = isRaining && (temperature < 0);

        System.out.println(" snowing: " + isSnowing);

    }
}
