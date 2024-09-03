import java.util.HashMap;
import java.util.PriorityQueue;

public class Main4new {
    public static void main(String[] args) {
        // Task 6: Create 3 Student objects
        Student kimjongun = new Student(3.9, 1001, new HashMap<>() {{
            put(1, "AI");
            put(2, "Web");
            put(3, "IoT");
        }});

        Student hoebiden = new Student(0.1, 1002, new HashMap<>() {{
            put(1, "AI");
            put(2, "Robotics");
        }});

        Student putin = new Student(2.1, 1003, new HashMap<>() {{
            put(1, "Web");
            put(2, "IoT");
            put(3, "AI");
            put(4, "Robotics");
        }});

        HashMap<String, Integer> vacancies = new HashMap<>() {{
            put("IoT", 1);

        }};

        // Task 7: Create a PriorityQueue
        PriorityQueue<Student> studentQueue = new PriorityQueue<>((s1, s2) ->
                Double.compare(s2.GPA, s1.GPA)); // Note: Reversed order for highest to lowest

        studentQueue.add(kimjongun);
        studentQueue.add(hoebiden);
        studentQueue.add(putin);

        // Task 8: Display the adm and GPA of Students
        System.out.println("Students in order of GPA (highest to lowest):");
        while (!studentQueue.isEmpty()) {
            Student student = studentQueue.poll();
            System.out.println("Admission: " + student.adm + ", GPA: " + student.GPA + "choices: " + student.choices);
            if (vacancies.containsKey(student.choices.get(1))) {
                System.out.println("Offered " + student.choices.get(1));
                vacancies.put(student.choices.get(1), vacancies.get(student.choices.get(1)) - 1);
                student.setCourse(student.choices.get(1));
                if (vacancies.get(student.choices.get(1)) == 0) {
                    vacancies.remove(student.choices.get(1));
                }
            } else if (vacancies.containsKey(student.choices.get(2))){
                System.out.println("Offered " + student.choices.get(2));
                vacancies.put(student.choices.get(2), vacancies.get(student.choices.get(2)) - 1);
                student.setCourse(student.choices.get(2));
                if (vacancies.get(student.choices.get(2)) == 0) {
                    vacancies.remove(student.choices.get(2));
                }
            } else if (vacancies.containsKey(student.choices.get(3))){
                System.out.println("Offered " + student.choices.get(3));
                vacancies.put(student.choices.get(3), vacancies.get(student.choices.get(3)) - 1);
                student.setCourse(student.choices.get(3));
                if (vacancies.get(student.choices.get(3)) == 0) {
                    vacancies.remove(student.choices.get(3));
                }
            } else if (vacancies.containsKey(student.choices.get(4))){
                System.out.println("Offered " + student.choices.get(4));
                vacancies.put(student.choices.get(4), vacancies.get(student.choices.get(4)) - 1);
                student.setCourse(student.choices.get(4));
                if (vacancies.get(student.choices.get(4)) == 0) {
                    vacancies.remove(student.choices.get(4));
                }
            } else {
                System.out.println("No courses available for " + student.adm);
            }
        }
        System.out.println("Vacancies left: " + vacancies);
    }
}
