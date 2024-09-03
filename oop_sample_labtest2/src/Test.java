import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<CCAClub> clubs = new LinkedList<>();
        clubs.add(new CCAClub("Basketball",80));
        clubs.add(new CCAClub("Soccer", 100));
        clubs.add(new CCAClub("DJ", 22));

        clubs.sort(new CompareClubByName());
        clubs.forEach(e-> System.out.println(e.name));

    }

}

class CCAClub {
    String name;
    int members; // no of members

    public CCAClub(String n, int m) {
        name = n;
        members= m;

    }

}

class CompareClubByName implements Comparator<CCAClub>{
    @Override
    public int compare(CCAClub o1, CCAClub o2) {
        return o1.name.compareTo(o2.name);
    }


}