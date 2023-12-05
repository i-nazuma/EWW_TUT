package library;

public class Library {
    private String name;
    private Book[] books;
    private int bookCount;


    public Library() {
        setName("Unbekannte Library");
        this.books = new Book[50];
        setBookCount(0);
    }

    public Library(String name, int bookCount) {
        this.name = name;
        this.books = new Book[bookCount];
        this.bookCount = bookCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
}
