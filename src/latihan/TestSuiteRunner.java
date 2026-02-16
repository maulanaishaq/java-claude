package latihan;

public class TestSuiteRunner {
    public static void main(String[] args) {

        String[] feature = {"Login Test", "Logout Test", "Add to Cart", "Checkout", "Payment"};

        System.out.println("===== RUNNING TEST SUITE =====");

        int counter = 1;
        for (String arr : feature){
            System.out.println((counter++) +". " + arr);

        }
        System.out.println("Total tests: " + (counter-1));



    }
}
