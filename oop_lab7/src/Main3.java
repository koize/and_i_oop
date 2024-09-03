import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("give number");
            int input = sc.nextInt();
            System.out.println("iterative: " + isPrime(input));
            System.out.println("recursive: " + checkPrime(input, 2));

        }

    }

    static boolean isPrime(int n){
        if (n <= 1) return false;
        if (sqrt(n) % 1 == 0) return false;
        for (int i = 2; i < n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean checkPrime(int input, int n){
        if (input <= 1 || sqrt(input) % 1 == 0) {
            return false;
        }
        else if (n == input) {
            return true;
        }
        else if (input % n != 0) {
            checkPrime(input, n+1);
        }
        else {
            return false;
        }
        return true;
    }

}
