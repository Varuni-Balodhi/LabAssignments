package Java_OOPs;

public abstract class Employee implements Payable {

    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getDetails() {
        return "Employee ID: " + employeeId + ", Name: " + name;
    }
}
