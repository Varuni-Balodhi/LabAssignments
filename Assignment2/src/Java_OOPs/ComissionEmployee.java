package Java_OOPs;

public class ComissionEmployee extends Employee {

    private double commissionRate; // percentage
    private double totalSales;

    public ComissionEmployee(String name, int employeeId,
                              double commissionRate, double totalSales) {
        super(name, employeeId);
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }

    @Override
    public double getPayment() {
        return (commissionRate * totalSales) / 100;
    }
}
