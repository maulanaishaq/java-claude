package latihan;

public class CSVTestDataParser {

    public static void main(String[] args) {

        String csvData = "John,Doe,john@test.com,25,true";

        String[] arr = csvData.split(",");

        System.out.println("===== USER DATA =====");


            System.out.println("Name: " + arr[0]);
            System.out.println("Last Name: " + arr[1]);
            System.out.println("Email: " + arr[2]);
            System.out.println("Age: " + arr[3]);
            System.out.println("Active: " + arr[4]);













    }
}
