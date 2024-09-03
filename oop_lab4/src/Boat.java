public class Boat extends Transportation{
    String basePort;

    public Boat(String speed, String name, String type, String basePort){
        super(speed, name, type);
        this.basePort = basePort;
    }

    void move(){
        super.move();
        System.out.println("The base port for " + name + "is " + basePort);
    }
}
