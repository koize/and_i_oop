public class Main3 {
    public static void main(String[] args){
        Boat b = new Boat("50", "Whitesand" , "Sea" , "Raffles Marina");
        setModeOfTravel(b);
    }
    public static void setModeOfTravel(Transportation t){
        t.move();
    }
}
