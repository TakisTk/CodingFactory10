package gr.aueb.cf.ch6;

/**
 * episkepsi se kathe stoixeio tou pinaka kai ektyposi tis timis
 */
public class ArrayTraverse {
    public static void main(String[] args) {
        int[] scores = { 10, 20, 30, 40, 50, 60, 70 ,80, 90, 100};

        for (int i = 0; i <= scores.length; i++){
            System.out.print(scores[i] + " ");
        }

        System.out.println();

        //enhanced for
        for (int score : scores) {
            System.out.print(score + " ");
        }

    }

}

