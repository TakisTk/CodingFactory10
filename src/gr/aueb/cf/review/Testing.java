package gr.aueb.cf.review;

public class Testing {

    public static void main(String[] args) {
        int x = 5;
        int y = ++x + x++ + --x;
        System.out.println(x + " " + y);
    }
}

