package latihan;

public class TestResultAnalyzer {
    public static void main(String[] args) {


        String[] status = {"PASS", "FAIL", "PASS", "SKIP", "PASS", "FAIL", "PASS"};

        System.out.println("===== TEST SUMMARY =====");

        int totalTests = 0;

        for (int i = 0; i < status.length; i++) {
            totalTests++;
        }

        System.out.println("Total tests: " + totalTests);


        int passed = 0;
        int failed = 0;
        int skipped = 0;

        String tempPassed = "PASS";
        String tempFailed = "FAIL";
        String tempSkip = "SKIP";


        for (int i = 0; i < status.length; i++) {


            String temp = status[i];

            if (temp.equals(tempPassed)) {
                passed++;
            } else if (temp.equals(tempFailed)) {
                failed++;
            } else if (temp.equals(tempSkip)) {
                skipped++;
            }


        }

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Skipped: " + skipped);

        double passRate = ((double) passed / (double) totalTests) * 100.0;
        System.out.printf("Pass rate: " + "%.2f",passRate);
        System.out.print("%");


    }
}
