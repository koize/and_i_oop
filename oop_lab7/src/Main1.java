import java.util.Scanner;

public class Main1 {
    //static String final_bin = "";
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("give number");
            int input = sc.nextInt();
            String result = decToBin(input, "");
            System.out.println(result);
        }

    }

    static String decToBin(int input, String result){

        if (input > 0) {
            int remainder = input % 2;
            return decToBin((input - remainder) / 2, remainder + result);
        }
        return result;
    }


    }
