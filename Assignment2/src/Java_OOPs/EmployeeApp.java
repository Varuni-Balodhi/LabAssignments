package Java_OOPs;

import java.util.ArrayList;

public class EmployeeApp {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new SalariedEmployee("Varuni", 101, 30000));
        employees.add(new SalariedEmployee("Aman", 102, 20000));
        employees.add(new SalariedEmployee("Riya", 103, 22000));

        System.out.println("=== Weekly Salary Report ===");

        for (Employee emp : employees) {
            System.out.println(
                emp.getDetails() +
                ", Weekly Salary: ₹" +
                emp.getPayment()
            );
        }
    }
}
