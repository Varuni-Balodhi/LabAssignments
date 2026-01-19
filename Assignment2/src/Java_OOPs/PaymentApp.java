package Java_OOPs;

import java.util.ArrayList;

public class PaymentApp {

    public static void main(String[] args) {

        ArrayList<Payable> payments = new ArrayList<>();

        // Employees
        payments.add(new SalariedEmployee("Amit", 101, 15000));
        payments.add(new HourlyEmployee("Riya", 102, 40, 300));
        payments.add(new ComissionEmployee("Rahul", 103, 10, 50000));

        // Invoices
        payments.add(new Invoice(201, "Laptop", 2, 45000));
        payments.add(new Invoice(202, "Printer", 1, 12000));

        System.out.println("Unified Payment Processing\n");

        for (Payable p : payments) {
            System.out.println("Payment Amount: ₹" + p.getPayment());
        }
    }
}
