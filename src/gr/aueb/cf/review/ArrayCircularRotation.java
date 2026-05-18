package gr.aueb.cf.review;

/**
 * theloume na metakinisoume ola ta stoixeia enos pinaka
 * pros ta deksia i pros ta aristera, me kukliki metatopisi
 */
public class ArrayCircularRotation {

    public static void main(String[] args) {

    }

    public static int[] shiftRightBy(int[] arr, int offset){
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }

        return rotated;
    }

    public static int[] shiftLeftBy(int[] arr, int offset){
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }

        return rotated;
    }
}
