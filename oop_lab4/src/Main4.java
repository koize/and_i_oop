import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main4 {
    public static void main(String[] args){
        Boat a = new Boat("10", "bob" , "Sea" , "Raffles Marina");
        Boat b = new Boat("20", "steve" , "Sea" , "Raffles Marina");
        Boat c = new Boat("30", "trump" , "Sea" , "Raffles Marina");
        Boat d = new Boat("40", "kim jong un" , "Sea" , "Raffles Marina");
        Boat e = new Boat("50", "hanni" , "sea" , "Raffles Marina");
        ArrayList<Boat> q1 = new ArrayList<Boat>();
        q1.add(a);
        q1.add(b);
        q1.add(c);
        q1.add(d);
        q1.add(e);
        setModeOfTravel(b);
        Collections.sort(q1, new NameComparator());
        for (Boat boat : q1) {
            System.out.println(boat.name + " " + boat.speed
                    + " " + boat.type + " " + boat.basePort);
        }
    }
    public static void setModeOfTravel(Transportation t){
        t.move();
    }


    static class NameComparator implements Comparator<Boat> {

        // override the compare() method
        public int compare(Boat s1, Boat s2)
        {
            return s1.name.compareTo(s2.name);
        }
    }
}
