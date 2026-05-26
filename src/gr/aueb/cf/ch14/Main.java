package gr.aueb.cf.ch14;

public class Main {
    static void main() {
        Point p1 = new Point(15.1);
        Point p2 = new Point2D(15.1, 20.2);
        Point p3 = new Point3D(15.1, 20.2, 30.3);

        Point p4 = new Point2D(15.1, 20.2);
        Point p5 = new Point3D(15.1, 20.2, 30.3);

        p1.movePlusOne();
        p2.movePlusOne();
        p3.movePlusOne();

        doMovePlusOne(p1);
        doMovePlusOne(p2);
        doMovePlusOne(p3);
        doMovePlusOne(p4);
        doMovePlusOne(p5);
    }

    // Polymorphism
    public static void doMovePlusOne(Point p) {
        p.movePlusOne();      // late binding
    }
}
