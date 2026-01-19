package Java_OOPs;

public class BookStore {

    private Book[] books;
    private int count;

    public BookStore() {
        books = new Book[10];
        count = 0;
    }

    // Order or add a book
    public void order(String isbn, int qty, String title, String author) {

        // Check if book already exists
        for (int i = 0; i < count; i++) {
            if (books[i].getISBN().equalsIgnoreCase(isbn)) {
                books[i].addCopies(qty);
                System.out.println("Quantity increased for " + title);
                return;
            }
        }

        // Add new book
        if (count < books.length) {
            books[count++] = new Book(title, author, isbn, qty);
            System.out.println("Book added: " + title);
        } else {
            System.out.println("Cannot add new book. Store is full.");
        }
    }
    // Sell a book
    public void sell(String title, int qty) {

        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                if (books[i].removeCopies(qty)) {
                    System.out.println("Sold " + qty + " copies of " + title);
                } else {
                    System.out.println("Not enough stock for " + title);
                }
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
    // Display all books
    public void display() {
        if (count == 0) {
            System.out.println("No books in store");
            return;
        }
        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }
}
