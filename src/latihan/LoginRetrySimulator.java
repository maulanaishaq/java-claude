package latihan;

public class LoginRetrySimulator {

    public static void main(String[] args) {

        int maxAttempts = 3;
        int currentAttempt = 0;
        boolean loginSuccess = false;

        while (currentAttempt < maxAttempts && !loginSuccess) {

            currentAttempt++;

            System.out.println("Attempt " + currentAttempt);

            if (currentAttempt == 3) {
                loginSuccess = true;
                System.out.println("Login SUCCESS");
            } else {
                System.out.println("Login FAILED");
            }
        }

        // ===== SETELAH LOOP =====
        if (!loginSuccess) {
            System.out.println("Account LOCKED");
        } else {
            System.out.println("Welcome user!");
        }
    }


}




