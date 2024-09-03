import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {
        Stack books = new Stack();
        Book java = new Book("1234", "Fundamentals of Java", "JJ");
        Book kotlin = new Book("3456", "Fundamentals of Kotlin", "KK");
        Book python = new Book("5678", "Fundamentals of Python", "PP");
        books.push(java);
        books.push(kotlin);
        books.push(python);
        System.out.println("Normal: ");
        books.forEach(e-> System.out.println(e));

        Stack booksReversed = new Stack();
        while(!books.isEmpty()) {
            booksReversed.push(books.pop());
        }

        System.out.println("Reversed: ");
        booksReversed.forEach(e-> System.out.println(e));



    }
}
