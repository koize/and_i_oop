import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list.size());
    }
}

class MyArrayList<E> {
    int INITIAL_CAPACITY = 10;
    E a[] = (E[]) new Object[INITIAL_CAPACITY];

    void add(E x) {
        if (a[a.length - 1] == null) {
            int i = 0;
            while (a[i] != null)
                i++;
            a[i] = x;
        } else {
            // increase size by 10
            int originalSize = a.length;
            int newSize = originalSize + 10;
            E b[] = (E[]) new Object[newSize];
            b = Arrays.copyOf(a, newSize);
            a = b;
            a[originalSize] = x;
        }
    }
    E get(int index){
        return(a[index]);
    }

    int size(){
        int i = 0;
        while (a[i] != null)
            i++;
        return i;
    }

    int remove(int index){
        if (index < a.length){
            a[index] = null;
            for (int i = index; i < a.length - 1; i++){
                a[i] = a[i+1];
            }
            return 0;
        }
        else {
            return -1;
        }

    }

}
