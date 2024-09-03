public class CoinVendingMachine implements VendingMachine{
    @Override
    public void printGuide() {
        System.out.println("This machine accepts coins only.");
        System.out.println("Drop in coins.");
        System.out.println("Select item.");
        System.out.println("Press GO button.");
    }
}
