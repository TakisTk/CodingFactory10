package gr.aueb.cf.review;

/**
 * dothentos enos string, epistrefei ena string
 * pou apotelei epanalipsi tou arxikou string, n fores
 *
 * gia paradeigma anm to arxiko string einai to abc kai to n = 3,
 * tote epistrefei abcabcabc
 */
public class RepeatedString {

    public static void main(String[] args) {
        String s = "abc";
        int n = 3;
        String result;

        result =  repeatedString(s, n);
        System.out.println(result);

    }

    public static String repeatedString(String s, int n){

        if (s == null){
            throw new IllegalArgumentException("String cannot be null");
        }

        if ( n < 0) {
            return "";

        }


        StringBuilder sb = new StringBuilder();

        sb.repeat(s, n);
        return sb.toString();
    }
}
