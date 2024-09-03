
public class Main2 {
    public static void main(String[] args) {
        TwoDPoint p1 = new TwoDPoint(10, 10);
        TwoDPoint p2 = new TwoDPoint(5, 5);
        TwoDPoint p3 = new TwoDPoint(); //0, 0

        System.out.println(p2.getDistance(p1));
        System.out.println(p1.getDistance(p3));
    }
}