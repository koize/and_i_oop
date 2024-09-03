//same as main3 (bubble sort) but with int instead

public class Main4 {
    public static void main(String[] args) {
        int[] a ={88, -8, -1, 59, 54, 71, 23 };
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
