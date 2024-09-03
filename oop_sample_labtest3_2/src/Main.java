public class Main {
    public static void main(String[] args) {
        String a = new String("abccba");
        if (isPalindrome(a, 0, a.length()-1))
            System.out.println(a + " is a palindrome");
        else
            System.out.println(a + " is NOT a palindrome");
    }

    public static boolean isPalindrome(String x, int i, int j) {
        if (i<(x.length()-1)) {
            if (x.charAt(i)!=x.charAt(j)) return false;
            else {
                i++;
                j--;
                isPalindrome(x,i,j);
            }
        }
        return(true);
    }
}