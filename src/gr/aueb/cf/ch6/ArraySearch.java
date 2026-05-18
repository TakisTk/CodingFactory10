package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * anazitisi enos stoixeiou se enan pinaka
 */

public class ArraySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 0;
        int position = 0;

        System.out.println("insert a value to search: ");
        value = in.nextInt();

        position = getPosition(arr, value);

        if (position == -1) {
            System.out.println("value not found");
        }
        else {
            System.out.println("value " + arr[position] + " found at position: " + (position + 1));
        }

    }

    public static int getPosition(int[] arr, int value){
        if(arr == null) return -1;  // den yparxei pinakas

        for (int i = 0; i < arr.length; i++) {   //diatrexw ton pinakka
            if (arr[i] == value) {  // sygkrisi
                return i;
            }
        }
        return -1;  // den vrethike
    }

    public static int getPositionV2(int[] arr, int value) {
        if (arr == null) return -1;
        int positionToReturn = -1;

        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return  positionToReturn;
    }
}
