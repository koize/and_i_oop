public class ThreeDPoint extends TwoDPoint{
    private double z;

    public ThreeDPoint() {
        super();
        z = 0;
    }

    public ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public double getDistance(ThreeDPoint remotePoint) {
        return Math.sqrt((Math.pow(x - remotePoint.x, 2)) + (Math.pow(y - remotePoint.y, 2)) + (Math.pow(z - remotePoint.z, 2)));
    }
}
