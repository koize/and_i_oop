import java.util.HashMap;

public class Student {
    public double GPA;
    public int adm;
    HashMap<Integer, String> choices;
    public String course;

    public Student(double GPA, int adm, HashMap<Integer, String> choices) {
        this.GPA = GPA;
        this.adm = adm;
        this.choices = choices;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
