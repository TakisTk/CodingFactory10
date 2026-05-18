package gr.aueb.cf.ch6;

/**
 * vriskei to elaxisto stoixeio enos pinaka
 */
public class ArrayMin {
    public static void main(String[] args) {

    }

    public static int getMinPossition(int[] arr){
        int minPosition = 0;
        int minValue = arr[minPosition];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return  minPosition;
    }

    public static int getMinPosition2(int[] arr) {
        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for ( int i = 0; i < arr.length; i++){
            if(arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}
