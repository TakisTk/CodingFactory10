package gr.aueb.cf.ch6;

/**
 * array Init & populate
 */
public class ArrayInit {

    public static void main(String[] args) {
        int[] arr1 = new int[5];  //default values: 0
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };  //unsized initialization
        int[] arr3;
        arr3 = new int[] { 1, 2, 3, 8, 13, 39 };  //array initializer

        //populate the array - gemisma timwn
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        System.out.println("arr1[0] = " + arr1[0]);
        System.out.println("arr1[1] = " + arr1[1]);
        System.out.println("arr1[2] = " + arr1[2]);
        System.out.println("arr1[3] = " + arr1[3]);
        System.out.println("arr1[4] = " + arr1[4]);
        System.out.println("arr1.length = " + arr1.length);
    }
}
