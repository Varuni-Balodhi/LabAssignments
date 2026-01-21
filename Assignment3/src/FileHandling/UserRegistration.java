package FileHandling;
public class UserRegistration {
    public void registerUser(String username, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException(
                "User " + username + " is not from India"
            );
        }
        System.out.println("User registration done successfully");
    }
    public static void main(String[] args) {
        UserRegistration ur = new UserRegistration();

        try {
            ur.registerUser("Varuni", "India");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
        try {
            ur.registerUser("Alex", "USA");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}

