public class Main5 {
    public static void main (String[] args) {
        int x = 64;
        int n = x;

        while (n>1){
            n = (int) Math.floor(n/2);
            for (int j = 1; j <= x; j++){
                System.out.println(j);
            }
        }
    }
}
