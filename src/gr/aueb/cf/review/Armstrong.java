package gr.aueb.cf.review;

/**
 * enas arithmos armstrong einai enas akeraios
 * arithmos pou eina iisos me to arthroisma
 * twv p[sifiwn tou opou to kathe psifio exei
 * ipsothei stin dunami tou arithmou twn psifeiwn..
 *
 * gia paradigma: to 153 = 1^3 + 5^3 + 3^3
 */
public class Armstrong {

    public static void main(String[] args) {

    }

    public static boolean isArmstrong(int num) {
        int numberOfDigits = 0;
        int temp = num;
        int digit = 0;
        int sum = 0;

        temp = num;
        while (temp != 0) {
            numberOfDigits ++;
            temp /= 10;
        }

        temp = num;
        while (temp != 0) {
            digit = temp % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            temp /= 10;
        }
        return sum == num;



    }
}
