package gr.aueb.cf.ch4;


public class SumMullApp {
    public static void main(String[] args) {

        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++){
            sum += i;
            mul *= i;
        }

        System.out.println("arthroisma akereon einai: " + sum);
        System.out.println("ginomeno akereon einai: " + mul);
    }
}
