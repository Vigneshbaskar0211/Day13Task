package JavaExceptionAndErrorHandling;

import java.util.Scanner;

public class LoginSystem {
    public static final String expectedPassword = "newpassword";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the password: ");
            String enteredPassword = scanner.nextLine();

            if (!authenticate(enteredPassword)) {
                throw new InvalidPasswordException("Incorrect password");
            }

            // If the authentication succeeds, proceed with the rest of your program
            System.out.println("Login successful!");
        } catch (InvalidPasswordException e) {
            System.out.println("Authentication failed: " + e.getMessage());
            // You can also log the authentication failure for auditing purposes
        } finally {
            scanner.close();
        }
    }

    public static boolean authenticate(String enteredPassword) {
        // Compare the entered password with the expected password
        return expectedPassword.equals(enteredPassword);
    }
}



