package latihan;

import java.util.Scanner;

public class TestHelperMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah Test: ");
        int totalTest = scanner.nextInt();

        String[] arr = new String[totalTest+1];

        int count = 0;


        for (int i = 0; i < arr.length; i++){

            arr[i] = scanner.nextLine();

            if (arr[i].toLowerCase().equals("passed")){
                count++;
            }

            if (i == totalTest){
                break;
            }

            System.out.print("Test "+(i+1)+" : "  );

        }


        TestHelperMethod method = new TestHelperMethod();

        double passRate = method.calculatePassRate(count, totalTest);
        System.out.println("Pass Rate: " + passRate +"%");



    }


    public void printHeader(String title) {
        System.out.println(title);
    }


    public double calculatePassRate(double passed, double total) {

        return (passed / total) * 100;
    }

    public boolean getTestStatus(boolean status) {

        return status;

    }


}
