package gr.aueb.cf.ch7;

/**
 * StringBuilder demo.
 */


public class StringBuiApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String result;
        String reversed;

        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        result = sb.toString();   //typecast to string
        reversed = sb
                .reverse()
                .toString();

    }
}
