// reversing numbers by repeatedly taking the last digit of the number and appending it to the reverse of the remaining digits
public class Main2 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 1000);
        System.out.println("Random number is: " + number);
        System.out.println("The reverse of the number is: " + reverse(number));
    }

    public static int reverse(int number) {
        int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        return reverse;
    }
}
