package latihan;

public class TestDataGenerator {

    public static void main(String[] args) {

        String username = "qatest01";
        String email = "qatest@example.com";
        int age = 25;
        boolean accountActive = true;
        boolean isAdult = true;

        System.out.println("======USER DATA=====");
        System.out.println("username : " + username);
        System.out.println("email : " + email);
        System.out.println("age : " + age);
        System.out.println("account active : " + accountActive);
        System.out.println("is adult : " + isAdult);

        isAdult = age >= 18 ;
        System.out.println("User is Adult " + isAdult);






    }
}
