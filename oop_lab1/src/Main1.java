import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {
        int integer1 = 1;
        int integer2 = 2;
        int integer3;
        System.out.println("integer1: " + integer1);
        System.out.println("integer2: " + integer2);

        integer3 = integer2;
        integer2 = integer1;
        integer1 = integer3;

        System.out.println("new integer1: " + integer1);
        System.out.println("new integer2: " + integer2);

    }
}
