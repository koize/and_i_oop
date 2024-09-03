//binary search

public class Main5 {
    public static void main(String args[])
    {
        int[] arr =  {-8, -1, 23, 54, 59, 71, 88}; //do more test
        int n = arr.length;
        int x = 88;
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }

    static int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // not present
        return -1;
    }

}
