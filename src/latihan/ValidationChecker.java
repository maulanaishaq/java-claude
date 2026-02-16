package latihan;

public class ValidationChecker {

    public static void main(String[] args) {

        boolean isUserRegistered = true;
        boolean isPasswordCorrect = true;
        boolean isAccountLocked = false;

        boolean canLogin = false;

        if (isUserRegistered && isPasswordCorrect && !isAccountLocked) {
            canLogin = true;

        }

        System.out.println("User Registered: " + isUserRegistered);
        System.out.println("Password Correct: " + isPasswordCorrect);
        System.out.println("Account Locked: " + isAccountLocked);
        System.out.println("Can Login: " + canLogin);

    }
}
