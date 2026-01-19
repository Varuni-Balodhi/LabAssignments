package Java_OOPs;
import java.util.*;
public class Book {

    private String bookTitle;
    private String author;
    private String isbn;
    private int numOfCopies;

    public Book(String bookTitle, String author, String isbn, int numOfCopies) {
        if (numOfCopies < 0) {
            throw new IllegalArgumentException("Number of copies cannot be negative");
        }
        this.bookTitle = bookTitle;
        this.author = author;
        this.isbn = isbn;
        this.numOfCopies = numOfCopies;
    }

    public String getISBN() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return bookTitle;
    }

    public int getCopies() {
        return numOfCopies;
    }

    public void addCopies(int count) {
        if (count > 0) {
            numOfCopies += count;
        }
    }

    public boolean removeCopies(int count) {
        if (count > 0 && numOfCopies >= count) {
            numOfCopies -= count;
            return true;
        }
        return false;
    }

    // Title – Author – ISBN – Quantity
    public void display() {
        System.out.println(bookTitle + " - " + author + " - " + isbn + " - " + numOfCopies);
    }
}
