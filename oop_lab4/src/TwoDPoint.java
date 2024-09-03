public class TwoDPoint {
    double x;
    double y;

    public TwoDPoint() {
        x = 0;
        y = 0;
    }

    public TwoDPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(TwoDPoint remotePoint) {
        return Math.sqrt((Math.pow(x - remotePoint.x, 2)) + (Math.pow(y - remotePoint.y, 2)));
    }
}
