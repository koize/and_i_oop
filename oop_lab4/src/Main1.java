public class Main1 {
    public static void main(String[] args) {
        double p1p2Dist;
        double p3p4Dist;
        TwoDPoint p1 = new TwoDPoint();
        TwoDPoint p2 = new TwoDPoint(3, 4);
        ThreeDPoint p3 = new ThreeDPoint();
        ThreeDPoint p4 = new ThreeDPoint(3, 4, 5);


        p1p2Dist = p1.getDistance(p2);
        System.out.println("2d: " + p1p2Dist);
        p3p4Dist = p3.getDistance(p4);
        System.out.println("3d: " + p3p4Dist);
    }
}