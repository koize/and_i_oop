import java.util.TreeSet;

public class Main5 {
    public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<>();
        ts1.add("netball");
        ts1.add("softball");
        ts1.add("baseball");
        ts1.add("basketball");
        ts1.add("basketball");
        System.out.println("1. " + ts1);

        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("netball");
        ts2.add("softball");
        ts2.add("football");
        System.out.println("3. " + ts2);

        TreeSet<String> ts3;
        ts3 = (TreeSet<String>) ts1.clone();
        System.out.println("clone" + ts3);
        ts3.addAll(ts2);
        System.out.println("addAll" + ts3);
        ts3.retainAll(ts1);
        System.out.println("retainAll" + ts3);
        ts3.removeAll(ts2);
        System.out.println("removeAll" + ts3);
        ts3.clear();
        System.out.println("clear" + ts3);
    }
}
