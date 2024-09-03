import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("give 1st number");
            int first = sc.nextInt();
            System.out.println("give 2nd number");
            int second = sc.nextInt();
            System.out.println("give n");
            int n = sc.nextInt();
            System.out.println(fibNumFrom(first, second, n));
        }

    }

    public static int f(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return (f(n-1)+f(n-2));
    }

    static int fibNumFrom(int first, int second, int n){
        if (n == 0) return first;
        else if (n == 1) return second;
        else return fibNumFrom(second, first + second, n-1);
    }

}
