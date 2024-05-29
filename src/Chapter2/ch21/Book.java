package Chapter2.ch21;

public class Book {

    private String title;
    private String author;

    public Book() {}
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }
    public void showInfo() {
        System.out.println(title + "," + author);
    }
}
