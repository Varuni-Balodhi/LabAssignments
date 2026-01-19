package Java_OOPs;

public class Invoice implements Payable {
	private int invoiceId;
    private String itemDescription;
    private int quantity;
    private double pricePerUnit;

    public Invoice(int invoiceId, String itemDescription,
                   int quantity, double pricePerUnit) {
        this.invoiceId = invoiceId;
        this.itemDescription = itemDescription;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public double getPayment() {
        return quantity * pricePerUnit;
    }

    public void display() {
        System.out.println(
            "Invoice ID: " + invoiceId +
            ", Item: " + itemDescription +
            ", Payment: ₹" + getPayment()
        );
    }
}
