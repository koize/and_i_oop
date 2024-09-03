public class TwoDPoint {
    private double x;
    private double y;

    public TwoDPoint() {  //set x and y to zero
        this.x = 0;
        this.y = 0;
    }

    public TwoDPoint(double x, double y) { //set x and y to arg
        this.x = x;
        this.y = y;
    }

    public double getX() { //return x
        return x;
    }

    public double getY() { //return y
        return y;
    }

    public double getDistance (TwoDPoint remotePoint){
        return Math.sqrt(Math.pow((remotePoint.getX() - this.x), 2) + Math.pow((remotePoint.getY() - this.y), 2));
        //length formula: sqrt((x2-x1)^2 + (y2-y1)^2)
    }
}
