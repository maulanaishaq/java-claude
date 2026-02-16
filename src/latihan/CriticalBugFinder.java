package latihan;

public class CriticalBugFinder {

    public static void main(String[] args) {

    int counter = 1;

        for (int i = 1; i <= 10; i++){

            if (i == 6){
                System.out.println("Running Test 6: CRITICAL BUG FOUND!");
                System.out.println("Stopping test execution...");
                break;
            }

            System.out.println("Running Test "+i+": PASSED");
            counter++;
        }

        System.out.println("Total tests executed: "+counter);



    }
}
