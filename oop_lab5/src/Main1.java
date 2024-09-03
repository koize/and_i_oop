import java.util.InputMismatchException;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        int arraySize;
        double[] array;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number of elements in the array");
            try {
                arraySize = sc.nextInt();
                array = new double[arraySize];
                while (true){
                    int i = 0;
                    while (i < arraySize) {
                        try {
                            System.out.println("Enter the element " + (i + 1));
                            array[i] = sc.nextDouble();
                            i++;
                        } catch (Exception e) {
                            System.out.println("wrong input type");
                            sc.next();
                        }
                    }
                    double avg = doubleAvgArray(array);
                    System.out.println("average: " + avg);
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("wrong input type");
                sc.next();
            }
            catch (NegativeArraySizeException e){
                System.out.println("Array size cannot be negative");
            }


        }
    }

    public static double doubleAvgArray(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}