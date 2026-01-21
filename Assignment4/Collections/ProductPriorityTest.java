import java.util.PriorityQueue;
import java.util.Comparator;
public class ProductPriorityTest {
    public static void main(String[] args) {
        Comparator<Product> priceAsc =
                (p1, p2) -> Double.compare(
                        p1.getProductPrice(),
                        p2.getProductPrice()
                );

        PriorityQueue<Product> queue =
                new PriorityQueue<>(priceAsc);
        queue.add(new Product(1, "Laptop", 60000));
        queue.add(new Product(2, "Pen", 10));
        queue.add(new Product(3, "Notebook", 25));
        queue.add(new Product(4, "Bag", 400));
        queue.add(new Product(5, "Mouse", 500));
        while (!queue.isEmpty()) {
            System.out.println(
                    "Processing product: " + queue.poll()
            );
        }
    }
}
