package latihan;

import java.util.Scanner;

public class TestSuiteAnalyzer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pass Rate : ");

        double passRate = scanner.nextDouble();

        if (passRate >= 95 && passRate <= 100) {
            System.out.println(passRate + "%");
            System.out.println("Status: EXCELLENT - Ready to release");
        } else if (passRate >= 80 && passRate < 95) {
            System.out.println(passRate + "%");
            System.out.println("Status: GOOD - Minor fixes needed");
        } else if (passRate >= 60 && passRate < 80) {
            System.out.println(passRate + "%");
            System.out.println("WARNING - Major bugs found");
        } else if (passRate < 60) {
            System.out.println(passRate + "%");
            System.out.println("CRITICAL - Do not release");

        }else {
            System.out.println("NOT FOUND");
        }
    }
}
