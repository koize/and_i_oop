import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        String s = "b.txt";
        try {
            readTextFile(s);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    public static void readTextFile (String a) throws FileNotFoundException {
        String s;
        File myFile = new File(a);
        Scanner sc = new Scanner(myFile);
        while (sc.hasNextLine()) {
            s = sc.nextLine();
            System.out.println(s);
        }
    }
}
