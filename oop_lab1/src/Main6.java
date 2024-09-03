import java.util.Scanner;
import java.util.stream.IntStream;

import static java.awt.SystemColor.text;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("type long story pls: ");
        String story = scanner.nextLine();

        searchStory2(story, "Apollo 13");
    }

    private static void searchStory(String story, String searchTerm){
        if (story.contains(searchTerm)){
            System.out.println(story.indexOf(searchTerm));
        } else {
            System.out.println("exit code -1");
        }
    }

    private static void searchStory2(String story, String searchTerm){
        if (story.contains(searchTerm)){
            int i = story.indexOf(searchTerm);
            while(i >= 0) {
                System.out.println(i);
                i = story.indexOf(searchTerm, i+1);
            }
        } else {
            System.out.println("not found");
        }
    }

}
