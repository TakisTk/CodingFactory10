package gr.aueb.cf.review;

/**
 * estw enas pinakas { 1,2, 4, ,4 ,4, 6, 7, 8, 8, 8, 12, 12, 12}
 * na epistrefei to low kai to high index
 * gia ena key.
 * an to key einai to 8, tote prepei na epistrepsei {7, 9} i
 * user friendly {8, 10}
 */
public class LowAndHighIndex {

    public static void main(String[] args) {

    }

    public static int[] table(int[] arr, int key) {
        int low = 0;
        int high = 0;
        int pivot = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key) {
                low = i;
                break;
            }
        }

        high = low;
        pivot = low + 1;

        while (pivot < arr.length && arr[pivot++] == key) {
            high++;
        }
        return new int[] {low, high};
    }
}
