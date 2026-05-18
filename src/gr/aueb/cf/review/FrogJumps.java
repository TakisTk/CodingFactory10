package gr.aueb.cf.review;

/**
 * apo ena simeio x, ftanei i ksepernaei ena simeio y,
 * opou kathe jump exei mikos jmp
 */
public class FrogJumps {

    public static void main(String[] args) {

    }

    public static int frogJumps(int start, int end, int jump){
        int jumps = 0;

        while (start < end) {
            jumps++;
        }
        return jumps;
    }

    public static int frogJumps2(int start, int end, int jump) {
        return (int) Math.ceil((double) (end - start) / jump);
    }
}
