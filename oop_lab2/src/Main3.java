//bubble sort

public class Main3 {
    public static void main(String[] args) {
        String a[] ={"aaa","qqq","AAA","QQQ"};
        for (int i = 0; i < a.length - 1; i++) { //iterates over each element in the array except the last one
            for (int j = i + 1; j < a.length; j++) { //starts from the next element and iterates over the remaining elements in the array.
                if (a[i].compareTo(a[j]) > 0) {
                    String temp = a[i]; //swap elements
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {  //print new sorted array
            System.out.println(a[i]);
        }
    }
}
