import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main2 {
    public static void main(String[] args) {
        String a[] = {"Raffles Marina", "Bedok", "Sultan Shoal", "Fort Canning"};
        ArrayList<String> a1 = new ArrayList<>(Arrays.asList(a));
        LinkedList<Object> LL1 = new LinkedList<Object>(a1);
        LL1.removeFirst();
        LL1.addFirst(111);
        LL1.removeLast();
        LL1.addLast(888);

        ListIterator<Object> li = LL1.listIterator();
        System.out.println("part 7");
        while(li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.println("part 8");
        while(li.hasPrevious()) {
            System.out.println(li.previous());
        }
        //System.out.println("8. " + LL1.list);
    }
}
