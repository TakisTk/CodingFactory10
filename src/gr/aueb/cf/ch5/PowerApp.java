package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * υπολογιζει την δυναμη α^β με μεθοδο
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("give base and power: ");
        base = in.nextInt();
        power = in.nextInt();

        result = pow(base, power);

        System.out.println("to apotelesma tis basis " + base + " kai tis dunamis " + power + " einai: " + result);




    }

    public static int pow(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++ ){
            result *= a;

    }
        return result;
    }
}
