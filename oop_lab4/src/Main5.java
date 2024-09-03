import java.util.ArrayList;
import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<Character> a1 = new ArrayList( Arrays.asList('r','P','t','w'));
        System.out.println (getMaximum(a1));
        ArrayList<Float> a2 = new ArrayList( Arrays.asList(111f,-99f,888f,333f));
        System.out.println (getMaximum(a2));
        ArrayList<String> a3 = new ArrayList( Arrays.asList("SP","SG","EEE","DCPE"));
        System.out.println (getMaximum(a3));
    }

    public static <E extends Comparable<E>> E getMaximum(ArrayList<E> x){
        E max = x.get(0);
        for (E e : x){
            if (e.compareTo(max) > 0){
                max = e;
            }
        }
        return max;
    }
}
