package gr.aueb.cf.ch3;

/**
 * upologizei to arthroisma twn 10 apo to 1-10
 */
public class Sum10 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int sum = 0;
        int mul =1;
        while( i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("sum = " +sum);

        while (j <= 10){
            mul *= j;
            j++;
        }
        System.out.println("mul = " + mul);
    }
}
