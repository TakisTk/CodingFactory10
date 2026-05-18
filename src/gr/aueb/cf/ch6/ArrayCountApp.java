package gr.aueb.cf.ch6;

/**
 * theloume na vroume poses fores emfanizete ena stoixeio
 * se enan pikana
 */

public class ArrayCountApp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4, 4};
        int count = 0;

        count = getCount(arr, 4);

        System.out.println(count);

    }

    public static int getCount(int[] arr, int value){
        if (arr == null) return -1;
        int count = 0;

       for(int element : arr){
           if(element == value) count++;
       }
       return count;

    }
}
