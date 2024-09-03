import java.util.zip.DataFormatException;

public class Main{
    public static void main(String[] args) {
        Object x= new Object();
        try{
            Integer y= (Integer) x;
        }
        catch (ClassCastException e){
            System.out.println("Wrong data type");
        }
    }
}
