package latihan;

public class EvenTestCounter {

    public static void main(String[] args) {

        System.out.println("Even Tests IDs:");

        int counter = 0;


        for (int i = 1; i <= 20; i++){
            if (i % 2 == 0){
                System.out.println(i);
                counter++;

            }
        }

        System.out.println("Total Even Tests: " + counter);





    }
}
