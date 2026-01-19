package Java_OOPs;
import java.util.*;
public class EmployeeApp {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        // Add different employee types
        employees.add(new SalariedEmployee("Varuni", 101, 30000));
        employees.add(new HourlyEmployee("Aman", 102, 40, 500));
        employees.add(new ComissionEmployee("Riya", 103, 10, 200000));
        System.out.println("=== Weekly Salary Report ===");
        for (Employee emp : employees) {
            emp.displayPayment();
        }
    }
}

