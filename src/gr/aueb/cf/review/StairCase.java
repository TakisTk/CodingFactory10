package gr.aueb.cf.review;

public class StairCase {

    public static void main(String[] args) {
        printStair(10);

        int x = -7;
        int y = 2;
        System.out.println(x % y);

    }



    public static void printStair(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - 1; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
