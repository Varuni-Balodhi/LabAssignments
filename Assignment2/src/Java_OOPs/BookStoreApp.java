package Java_OOPs;

public class BookStoreApp {

    public static void main(String[] args) {

        BookStore store = new BookStore();

        System.out.println("Adding sample books");
        store.order("ABC123", 5, "Mathematics", "Tanvi");
        store.order("BHG456", 4, "Physics", "HC Verma");
        store.order("UIJHK2", 1, "Chemistry", "Nootan");
        store.display();

        System.out.println("\nOrdering the existing book");
        store.order("ABC123", 3, "Mathematics", "Tanvi");
        store.order("BHG456", 2, "Physics", "HC Verma");
        store.display();

        System.out.println("\nSell the books");
        store.sell("Mathematics", 2);
        store.display();

        System.out.println("\nSelling a book that is not available");
        store.sell("HeadFirst", 1);

        System.out.println("\nSelling more than the available");
        store.sell("Chemistry", 20);
    }
}
