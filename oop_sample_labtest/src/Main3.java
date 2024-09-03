import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of 4D for this draw: ");
        int count = sc.nextInt();

        Draw draw = new Draw(count);
        draw.generate4DList();
        draw.displayList();
    }
}
