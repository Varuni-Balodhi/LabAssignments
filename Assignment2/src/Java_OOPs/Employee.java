package Java_OOPs;
import java.util.*;

public abstract class Employee {

    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method to be overridden
    public abstract double getPayment();

    // Common display method
    public void displayPayment() {
        System.out.println(
            "Employee ID: " + employeeId +
            ", Name: " + name +
            ", Weekly Salary: ₹" + getPayment()
        );
    }
}

