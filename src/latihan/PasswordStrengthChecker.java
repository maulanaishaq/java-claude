package latihan;

import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Password: ");

        String inputPassword = scanner.nextLine();

        int point = 0;

        boolean hasLength = false;

        if (inputPassword.length() >= 8) {
           hasLength = true;
        }

        if (hasLength){
            point++;
        }


        boolean hasNumber = false;

        if (inputPassword.matches(".*[0-9].*")) {
            hasNumber = true;
        }

        if (hasNumber){
            point++;
        }


        char[] passUp = inputPassword.toCharArray();
        boolean hasUppercase = false;

        for (int i = 0; i < passUp.length; i++) {

            if (Character.isUpperCase(passUp[i])) {
                hasUppercase = true;
            }
        }

        if (hasUppercase){
            point++;
        }

        boolean hasLowerCase = false;

        if (inputPassword.matches(".*[a-z].*")) {
            hasLowerCase = true;
        }

        if (hasLowerCase){
            point++;
        }

        System.out.println("Password: " + inputPassword);
        System.out.println(hasLength    ? "✓ Length OK" : "✗ Length too short (min 8)");
        System.out.println(hasNumber    ? "✓ Contains number" : "✗ No number found");
        System.out.println(hasUppercase ? "✓ Contains uppercase" : "✗ No uppercase found");
        System.out.println(hasLowerCase ? "✓ Contains lowercase" : "✗ No lowercase found");
        System.out.println("Strength Score: " + point + "/4");



        switch (point) {
            case 4:
                System.out.println("Rating: STRONG");
                break;

            case 3:
                System.out.println("Rating: MEDIUM");
                break;

            case 2:
            case 1:
                System.out.println("Rating: WEAK");
                break;

            default:
                System.out.println("Rating: VERY WEAK");

        }
    }
}









