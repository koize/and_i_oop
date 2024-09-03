public class Book {
    String ISBN, author, title;
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String toString() {
        return (ISBN + "-" + title + "-by " + author);
    }
}

