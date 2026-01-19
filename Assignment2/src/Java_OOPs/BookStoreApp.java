package Java_OOPs;
import java.util.*;
public class BookStoreApp {
public static void main(String[] args) {
	BookStore store=new BookStore();
	//isbn,qty,title,authorname.
	System.out.println("Adding sample books");
	store.order("ABC123",5,"Mathematics","Tanvi");
	store.order("BHG456",4,"Physics","HCVerma");
	store.order("UIJHK2", 1,"Chemistry","Nootan");
	store.display();
	System.out.println("Ordering the existing book");
	store.order("ABC123",3,"Mathematics","Tanvi");
	store.order("BHG456",2,"Physics","HCVerma");
	store.display();
	System.out.println("Sell the books");
	store.sell("RuskinBond", 1);
	store.display();
	System.out.println("Selling a book that is not available");
	store.sell("HeadFirst", 1);
	store.display();
	System.out.println("Selling more than the available");
	store.sell("Rabindranath Tagore", 20);
}
}
