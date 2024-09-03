import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        a.adjList.add(b);
        a.adjList.add(c); // write your answers in space below

        b.adjList.add(d);

        d.adjList.add(c);

        c.adjList.add(a);

    }

}

class Vertex{
    String label;
    ArrayList<Vertex> adjList = new ArrayList<>();
    Vertex (String label) { this.label = label; }
}