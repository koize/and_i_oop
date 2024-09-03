public class Transportation {
    String speed;
    String name;
    String type;

    public Transportation (String speed, String name, String type) {
        this.speed = speed;
        this.name = name;
        this.type = type;
    }

    void move(){
        System.out.println("Moving in " + type + " at speed of " + speed);
    }
}
