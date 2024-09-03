import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Sentosa");
        a1.add("Seletar Island");
        a1.add("Sisters Island");
        a1.add("St. John's Island");
        a1.add("Pulau Ubin");

        System.out.println("2. " + a1);

        a1.remove(2);

        System.out.println("4. " + a1);

        System.out.println("5. " + "Contains sisters island: " + a1.contains("Sisters Island"));

        ArrayList<String> a2 = new ArrayList<String>();

        a2 = (ArrayList<String>) a1.clone();

        System.out.println("8. " + a2);

        a2.add(2, "Pulau Tekong");

        ArrayList<String> a3 = new ArrayList<String>();
        ArrayList<String> a4 = new ArrayList<String>();

        a3 = (ArrayList<String>) a1.clone();
        a4 = (ArrayList<String>) a2.clone();

        a3.addAll(a4);
        System.out.println("11. " + a3);
        a3 = a1;

        a3.retainAll(a4);
        System.out.println("13. " + a3);
        a3 = a1;

        a4.removeAll(a3);
        System.out.println("15. " + a4);


    }
}