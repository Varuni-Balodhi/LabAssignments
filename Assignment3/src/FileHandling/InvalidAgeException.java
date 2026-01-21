package FileHandling;

public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super("Age must be between 18 and 59");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
