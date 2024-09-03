
public class Main {
    public static void main(String[] args) {

        System.out.println("Degree  " + "sin  " + "cos");
        for (int i = 0; i <= 360; i+=10) {
            // formatting string
            System.out.println(i + "  " + Math.round(Math.sin(Math.toRadians(i)) * 10000.0)/10000.0 + "  " + Math.round(Math.cos(Math.toRadians(i)) * 10000.0)/10000.0);
        }
    }
}