package latihan;

public class TestResultCalculator {
    public static void main(String[] args) {


        double totalTests = 50 , passTests = 42;
        double failedTests = totalTests - passTests;

        double passRate = (passTests / totalTests) * 100 ;

        System.out.println("Total tests : " + (int)totalTests);
        System.out.println("Pass tests : " + (int)passTests);
        System.out.println("Failed tests : " + (int)failedTests);
        System.out.println("Pass rate : " + passRate+"%");





    }
}
