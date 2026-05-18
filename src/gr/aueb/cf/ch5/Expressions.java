package gr.aueb.cf.ch5;

public class Expressions {
    public static void main(String[] args) {
        int myInt = 10;
        float myFloat = 10.5f;
        double myDouble = 10.5;
        double result = 0.0;
        final double PI = 3.141592639483985354678876879;
        final double LIGHT_SPEED = 299792458.0;

        result = myInt + myFloat + myDouble;

        System.out.println("result: " + result);
        System.out.printf("result formatted: %.2f\n", result);
        System.out.printf("PI: %.5e, LIGHT-SPEED = %.3e\n",  PI, LIGHT_SPEED);
    }
}
