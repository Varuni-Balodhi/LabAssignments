public class BookCollectionTest {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Java in Depth", "Mehta"),
                new Book("Spring Boot", "Sharma"),
                new Book("Java Basics", "Raj")
        };

        BookCollection collection =
                new BookCollection("Rajeev Gupta", books);
        Book searchBook = new Book("Java in Depth", "Mehta");
        collection.hasBook(searchBook); 
        collection.sort();
        System.out.println(collection);
    }
}
