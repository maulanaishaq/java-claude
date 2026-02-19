package latihan;

import java.util.Scanner;

public class TestCaseManagerAdvanced {

    private String[] testNames = new String[10];
    private boolean[] testResults = new boolean[10];
    private int testCount = 0;

    public static void main(String[] args) {


        TestCaseManagerAdvanced testCaseManager = new TestCaseManagerAdvanced();

        testCaseManager.addTestCase("Login Test");
        testCaseManager.addTestCase("Profile Test");
        testCaseManager.addTestCase("Register Test");
        testCaseManager.addTestCase("Checkout Test");

        testCaseManager.runTestCase("Login Test" , true);
        testCaseManager.runTestCase("Profile Test" , false);
        testCaseManager.runTestCase("Register Test" , true);
        testCaseManager.runTestCase("Checkout Test" , true);


        testCaseManager.generateReportt();



    }


    public void addTestCase(String name){
        testNames[testCount] = name;
        testCount++;
        System.out.println("Added: " + name);
    }


    public void runTestCase(String name, boolean result){

        for (int i = 0; i < testCount; i++){
            if (testNames[i].equals(name)){
                testResults[i] = result;
                System.out.println(name + ": " + (result ? "PASSED " : "FAILED"));
                return;
            }
        }

    }

    public void generateReportt(){
        int passed = 0;
        int failed = 0;

        for (int i = 0; i < testCount; i++){
            if (testResults[i]){
                passed++;
            }else {
                failed++;
            }
        }

        System.out.println("\n===== REPORT =====");
        System.out.println("Total: " + testCount);
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.printf("Pass Rate: %.2f%%\n", (passed * 100.0) / testCount);

    }







}
