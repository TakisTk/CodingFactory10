package gr.aueb.cf.ch13;

public class Point {
    private int x;
    private int y;

    private Point() {}


    /**
     * Static factory method.
     * Επιστρέφει ένα νέο Point
     * @return a new Pont instance.
     */
    public static Point getInstance() {
        return new Point();
    }


}
