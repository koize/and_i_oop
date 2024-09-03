import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("give key");
            int key = sc.nextInt();
            int result = checkKey(arr, key, 0, arr.length - 1);
            if (result == -1){
                System.out.println("no u the key does not exist!!!");
            }
            else {
                System.out.println("index of " + key + " is " + result);
            }
        }

    }

    static int checkKey(int[] input, int key, int start, int end){
        if (start > end) return -1;
        int mid = (start + end) / 2;
        if (input[mid] == key) return mid;
        else if (input[mid] > key) return checkKey(input, key, start, mid - 1);
        else return checkKey(input, key, mid + 1, end);
    }
}
