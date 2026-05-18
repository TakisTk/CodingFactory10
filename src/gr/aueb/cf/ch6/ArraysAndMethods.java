package gr.aueb.cf.ch6;

/**
 *pws pername enan pinaka wx tipiki parametro mias methodou
 * kai pws kaloume mia methodo pernwntas pinaka ws pragmatiki parametro
 */
public class ArraysAndMethods {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);

        printArray(arr, 0, arr.length);

    }


    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.println(item + " ");
        }

        arr[1] = 100;
    }

    public static void printArray(int[] arr, int low, int high) {
        if (arr == null) return;
        if ( low < 0 || high > arr.length) return;
        if (low > high) return;

        for(int i = low; i < high; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
