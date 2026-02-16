package latihan;

public class FailedTestReporter {

    public static void main(String[] args) {


        String[] feature = {"Login", "Logout", "Register", "Search", "Checkout"};
        boolean[] results = {true, true, false, true, false};

        int totalFailed = 0;
        System.out.println("===== FAILED TESTS =====");


        for (int i = 0; i < results.length; i++) {

            if (results[i]) {

            } else {
                String s = feature[i];
                System.out.println("Test " + (i+1) + " " +s+ " - " + results[i]);
                totalFailed++;

            }

        }

        System.out.println("Total Failed: " + totalFailed);



    }
}
