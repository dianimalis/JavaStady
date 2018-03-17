package OfflinePractice09_10;

/**
 * Created by MARIA on 09.10.17.
 */
public class Point {
    public static Point ZERO = new Point(0,0);
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double calcLength(Point otherPoint) {
        return Math.sqrt(Math.pow(otherPoint.x - x,2)+Math.pow(otherPoint.y- y,2));
    }

    public Point normilize() {
        Point np = new Point(x/calcLength(ZERO),y/calcLength(ZERO));
        return np;
    }


    public Point minus(Point otherPoint) {
        Point temp = new Point(otherPoint.x - x, otherPoint.y - y );
        return temp;
    }

}
