import java.util.Scanner;
import java.util.stream.*;

public class Main3 {
    public static void main(String[] args) {
        int value;
        int[] results = new int[1];
        int i = 0;
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        while (true) {
            System.out.printf("enter number, enter 0 to exit");
            value = scanner.nextInt();
            if (value == 0) {
                System.out.println("exit");
                break;
            }
            i++;
            results = addX(i, results, value);
        }
        if (results.length > 0) {
            int sum = IntStream.of(results).sum();
            double avg = (double) sum / results.length;
            System.out.println("avg: " + avg);
        }

    }
    public static int[] addX(int n, int[] arr, int x)
    {
        int i;

        // create a new array of size n+1
        int newarr[] = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }
}
