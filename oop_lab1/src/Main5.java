public class Main5 {
    public static void main(String[] args) {
        float a;
        int b;
        byte c, d;
        String e;

        a = (float) getArea(10);
        b = (int) getFullBag(77);
        c = 7;
        d = (byte) (c + c);
        e = a + "" + c;
    }

    public static double getArea(int r){
        return (r*r*22.0/7);
    }

    public static double getFullBag(int apples){
        return (apples/10.0);
    }
}