package latihan;

import java.util.Scanner;

public class TestCaseManager {

    public static void main(String[] args) {

        TestCaseManager testCaseManager = new TestCaseManager();

        testCaseManager.addTestCase("Login Test");
        testCaseManager.addTestCase("Profile Test");
        testCaseManager.addTestCase("Register Test");
        testCaseManager.addTestCase("Home Test");

        testCaseManager.runTestCase("Login Test " , true);
        testCaseManager.runTestCase("Profile Test " , true);
        testCaseManager.runTestCase("Register Test " , true);
        testCaseManager.runTestCase("Home Test " , true);


        testCaseManager.generateReport(70, 30);



    }



    public void addTestCase(String name){

        System.out.println("Test Name: " + name);

    }

    public void runTestCase(String name, boolean result){

        if (result){
            System.out.println(name + " " + "PASSED");
        }else {
            System.out.println(name + " " + "FAILED");
        }
    }

    public void generateReport (int passed, int failed){
        int total = passed + failed;

        double passRate = (passed * 100) / total;

        System.out.println("\n===== REPORT =====");
        System.out.println("Total: " + total);
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.printf("Pass Rate: %.2f%%\n", passRate);

    }





}
