import java.util.Scanner;

import static java.util.stream.IntStream.of;
import static java.util.stream.Stream.concat;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        int i;
        String[] names = new String[3];
        int[] ages = new int[3];
        String[] sch = new String[3];
        for (i = 1; i < 4; i++){
            System.out.printf("Enter name " + i + ": ");
            names[i - 1] = scanner.nextLine();
            System.out.printf("Enter age " + i + ": ");
            ages[i - 1] = scanner.nextInt();
            scanner.nextLine();
            System.out.printf("Enter school " + i + ": ");
            sch[i - 1] = scanner.nextLine();
        }
        for (i = 0; i < 3; i++){
            System.out.println("Name: " + names[i] + ", Age: " + ages[i] + ", School: " + sch[i]);
        }
    }
}
