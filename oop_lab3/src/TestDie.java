public class TestDie {
    public static void main(String[] args) {

        Die die = new Die(6);
        System.out.println("roll: " + die.roll());
    }

    static class Die {  //Die class is declared static to make it clear that it can exist independently of the TestDie class,
        int maxFace;
        public Die (int maxFace) {
            this.maxFace = maxFace;
        }

        int roll() {
            return (int) (Math.random() * maxFace) + 1; // random number between 1 (min) and maxFace (max)
        }
    }
}
