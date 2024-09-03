import java.util.HashMap;

public class Main4 {
    public static void main(String[] args) {
        HashMap<Integer, VendingMachine> vmGroup = new HashMap<>();

        CoinVendingMachine v1 = new CoinVendingMachine();
        vmGroup.put(1, v1);
        CoinNoteVendingMachine v2 = new CoinNoteVendingMachine();
        vmGroup.put(2, v2);

        for (int i=1; i <= vmGroup.size(); i++)
            printInstruction(vmGroup.get(i));

    }
    public static void printInstruction (VendingMachine v) {
        v.printGuide();
    }
}