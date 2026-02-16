package latihan;

import java.util.Scanner;

public class TestPriorityClassifier {

    public static void main(String[] args) {

        System.out.print("Test dengan severity = ");
        Scanner scanner = new Scanner(System.in);

        int severity = scanner.nextInt();



        if (severity == 1){
            System.out.println("Severity: " + severity);
            System.out.println("CRITICAL - Fix immediately");
        }else if (severity == 2){
            System.out.println("Severity: " + severity);
            System.out.println("HIGH - Fix in current sprint");
        }else if (severity == 3){
            System.out.println("Severity: " + severity);
            System.out.println("MEDIUM - Fix in next sprint");
        }else if (severity == 4){
            System.out.println("Severity: " + severity);
            System.out.println("LOW - Backlog");
        }else if (severity == 5){
            System.out.println("Severity: " + severity);
            System.out.println("TRIVIAL - Nice to have");
        }else {
            System.out.println("Severity: " + severity);
            System.out.println("Severity yang diinput salah, Severity hanya ada 1 - 5");
        }



    }
}
