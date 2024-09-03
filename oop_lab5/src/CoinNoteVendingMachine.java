public class CoinNoteVendingMachine implements VendingMachine{

    @Override
    public void printGuide() {
        System.out.println("This machine accepts coins and notes.");
        System.out.println("Drop in coins and insert notes.");
        System.out.println("Select item.");
        System.out.println("Press GO button.");
    }
}
