//package gr.aueb.cf.ch6;
//
//
//import static java.util.Collections.swap;
//
//public class SelectionSort {
//    public static void main(String[] args) {
//
//    }
//
//    public static int[] selectionSort(int[] arr) {
//        int minPosition;
//        int minValue;
//
//        for (int i = 0; i < arr.length - 1; i++){
//            minPosition = i;
//            minValue = arr[minPosition];
//
//            for ( int j = i + 1; j < arr.length; j ++){
//                if (arr[j] < minValue){
//                    minPosition = j;
//                    minValue = arr[j];
//
//                }
//            }
//            swap( arr, minPosition, i);
//        }
//        return arr;
//    }
//}
