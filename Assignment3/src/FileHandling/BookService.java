package FileHandling;
import java.io.*;
import java.util.LinkedList;
public class BookService {
    LinkedList<Book> bookList = new LinkedList<>();
    public void loadBooks(String fileName) {

        try (BufferedReader br =
                     new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(":");

                int id = Integer.parseInt(data[0]);
                String isbn = data[1];
                String title = data[2];
                String author = data[3];
                double price = Double.parseDouble(data[4]);

                // Default quantity = 10
                Book book = new Book(id, isbn, title, author, price, 10);
                bookList.add(book);
            }

        } catch (IOException e) {
            System.out.println("Error reading book file.");
        }
    }
    public Book searchBook(int id) {

        for (Book b : bookList) {
            if (b.id == id) {
                return b;
            }
        }
        return null;
    }

    /* -------------------------------
       PART B: Sell Book
    -------------------------------- */
    public void sellBook(String isbn, int noOfCopies)
            throws NotSufficientBookException {

        for (Book b : bookList) {
            if (b.isbn.equals(isbn)) {
                if (b.quantity < noOfCopies) {
                    throw new NotSufficientBookException(
                            "Not enough copies available!");
                }
                b.quantity -= noOfCopies;
                System.out.println("Book sold successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
   
