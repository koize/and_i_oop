public class Rose extends Flower{
    String name;
    String meaning;

    public Rose (String color, String origin, String name, String meaning){
        super(color, origin);
        this.name = name;
        this.meaning = meaning;
    }

    public String toString(){
        return "Rose name= " + name + ", meaning= " + meaning + ", color= " + color + ", origin= " + origin;
    }
}
