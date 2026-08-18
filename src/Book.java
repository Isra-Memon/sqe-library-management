public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

       public Book(String title, String author, String isbn) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }
    public void borrow() {
        this.isAvailable = false;
    }

    public void returnBook() {
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }
}