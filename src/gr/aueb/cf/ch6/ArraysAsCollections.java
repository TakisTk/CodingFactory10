package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * oi vasikes prakseis se suloges opws oi pinakes einai:
 * filtering
 * mapping
 * reducing
 */
public class ArraysAsCollections {
    public static void main(String[] args) {


    }

    public static int[] filterEven(int[] arr){
        if (arr == null || arr.length == 0) return new int[0];
        int[] arrayToReturn = new int[arr.length];
        int count = 0;

        for(int element : arr) {
            if (element % 2 == 0) {
                arrayToReturn[count++] = element;
            }
        }

        return Arrays.copyOf(arrayToReturn, count);
    }

    public static int[] mapToDouble(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int[] mappedArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            mappedArray[i] = arr[i] * 2;
        }
        return mappedArray;
    }

    public static int sum(int[] arr) {
        if (arr == null) return 0;
        int sum = 0;
        for (int element : arr){
            sum += element;
        }
        return sum;
    }


    public static boolean isAllEven(int[] arr){
        int count = 0;
        for(int element : arr){
            if (count > 2) return true;
            if (element % 2 == 0) count ++;
        }
        return false;

    }


    public static double avg(int[] arr){
        return  (double)sum(arr) / arr.length;
    }

    public static boolean anyEver(int[] arr){
        for (int element : arr){
            if (element % 2 == 0) return true;
            }
        return false;
        }
    }

