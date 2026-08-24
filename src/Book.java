/**
 * Represents a book in the library management system.
 * Tracks basic details and availability status for borrowing.
 */
// Version 1.1 - added borrow validation 
public class Book {
    private String title;
    private String author;
    private String bookId;
    private boolean isAvailable;
    public Book(String title, String author, String bookId) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.isAvailable = true;
    }
  public void borrow() {
    if (!this.isAvailable) {
        throw new IllegalStateException("Book is already borrowed");
    }
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
// TODO: add unit tests for borrow/returns 
}