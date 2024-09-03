import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        PrintMachine canon = new PrintMachine();
        PrintMachine fujitsu = new PrintMachine();
        PrintMachine horribleProduct = new PrintMachine();


        System.out.println(Arrays.toString(canon.copy("Flying!", 6)));
        System.out.println(Arrays.toString(fujitsu.copy("High!", 8)));
        System.out.println("total prints: " + horribleProduct.getTotalNoOfCopy());
    }
}
