import java.io.IOException;
import java.util.Scanner;  // Import the Scanner class
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    static int marks;
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        while (true) {
            System.out.println("enter your marks");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                checkGrade(marks);
            } else if (marks == -1) {
                System.out.println("exit");
                break;
            } else {
                System.out.println("invalid mark");
            }
        }
    }
    private static void checkGrade(int mark) {
        if (mark >= 80 && mark <= 100) {
            System.out.println("A");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("B");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("C");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("D");
        } else if (mark >= 0 && mark < 50) {
            System.out.println("F");
        }
        else {
            System.out.println("invalid mark");
        }
    }
    }



