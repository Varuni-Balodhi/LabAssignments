package FileHandling;
import java.io.*;
public class SerializationDemo {
    public static void main(String[] args) {
        Employee emp =
            new Employee(
                101,
                "Varuni",
                new Address("Dehradun", "Uttarakhand"),
                75000.50
            );
        try (ObjectOutputStream oos =
                 new ObjectOutputStream(
                     new FileOutputStream("employee.ser"))) {

            oos.writeObject(emp);
            System.out.println("Employee object serialized successfully.\n");

        } catch (IOException e) {
            System.out.println("Serialization failed!");
        }
        try (ObjectInputStream ois =
                 new ObjectInputStream(
                     new FileInputStream("employee.ser"))) {

            Employee deserializedEmp = (Employee) ois.readObject();

            System.out.println("Deserialized Employee Details:");
            deserializedEmp.display();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization failed!");
        }
    }
}
