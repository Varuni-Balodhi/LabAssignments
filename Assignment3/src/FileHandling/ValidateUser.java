package FileHandling;
public class ValidateUser {
    public static void main(String[] args) {

        try {
            // Validate command-line arguments count
            if (args.length != 2) {
                System.out.println("Please provide name and age");
                return;
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            // Age validation
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException();
            }

            // Valid case
            System.out.println("Name: " + name + ", Age: " + age);

        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Age must be a valid number");
        }
    }
}
