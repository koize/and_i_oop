public class Main2 {
}

interface Transportation {
    void Move();

}

class LandTransport implements Transportation {
    double speed;

    LandTransport(double speed) {
        this.speed = speed;

    }

    public void Move() {
        System.out.println("Moving on land");

    }

}

class LRT extends LandTransport {
    LRT(double speed) {
        super(speed);
    }

    public void Move() {
        System.out.println("Moving on rail tracks");

    }

}