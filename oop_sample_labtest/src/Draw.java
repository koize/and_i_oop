import java.util.ArrayList;

public class Draw {
    int count;
    ArrayList<String> arrayList = new ArrayList<>();

    Draw(){
        count = 10;
    }

    Draw(int count){
        this.count = count;
    }

    String getSingle4D(){
        return Integer.toString((int) (Math.random()*10000));
    }
    void generate4DList(){
        for (int i = 0; i < count; i++){
            arrayList.add(getSingle4D());
        }
    }
    void displayList(){
        String first = arrayList.get(0);
        String second = arrayList.get(1);
        String third = arrayList.get(2);
        String output = "1st: " + first + "\n" + "2nd: " + second + "\n" + "3rd: " + third + "\n" + "\n" + "Others: \n";
        for (int i = 3; i < arrayList.size(); i++){
            output += arrayList.get(i) + " ";
            if ((i-2) % 5 == 0){
                output += "\n";
            }
        }

        System.out.println(output);


    }
}
