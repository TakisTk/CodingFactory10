package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StrIO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = "";
        String str2 = "";

        System.out.println("παρακαλω εισαγετε 2 strings: ");

        str1 = in.next(); //διαβαζει μεχρι το επομενο καινο
        str2 = in.nextLine(); //διαβαζει μεχρι να βρει new line
    }
}
