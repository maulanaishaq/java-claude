package latihan;

import java.util.Scanner;

public class LoginValidator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Validasi username
        boolean validationUsername = username.length() >= 5; // Minimal 5

        if (validationUsername) {
            System.out.println("Username Validation: PASSED");
        } else {
            System.out.println("Username Validation: FAILED (too short)");
        }

        // Validasi password
        boolean validationPassword = password.length() >= 8; // Minimal 8

        if (validationPassword) {
            System.out.println("Password Validation: PASSED");
        } else {
            System.out.println("Password Validation: FAILED (too short)");
        }

        // Validasi credentials tidak boleh sama
        boolean sameCredentials = username.equals(password);

        if (sameCredentials) {
            System.out.println("Credentials Match: FAILED (username and password are the same)");
        } else {
            System.out.println("Credentials Match: PASSED");
        }

        // Final decision
        boolean loginStatus = validationUsername && validationPassword && !sameCredentials;

        System.out.println("Login Status: " + (loginStatus ? "APPROVED" : "REJECTED"));

        scanner.close(); // Good practice: close scanner
    }
}


