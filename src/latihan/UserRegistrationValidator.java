package latihan;

public class UserRegistrationValidator {
    public static void main(String[] args) {

        UserRegistrationValidator register = new UserRegistrationValidator();

        //register.usernameValidation("aaarr");
        //register.usernameValidation("asdasdsajahsdjhsajdhsajhdjashdjasajhdaj");
        // register.usernameValidation("aasdsd");
        // register.usernameValidation("123456@");
        register.usernameValidation("mieoir32");

       // register.emailValidation("aaaa");
        //register.emailValidation("sadas@");
        register.emailValidation("test@gmail.com");

       // register.passwordValidation("a");
      //  register.passwordValidation("adafdfdsda");
       // register.passwordValidation("aAAAdfdddd");
       // register.passwordValidation("adadfds32");
        register.passwordValidation("Adadfdfdfs32");

        //register.ageValidation(17);
        register.ageValidation(18);
       // register.ageValidation(100);
       // register.ageValidation(101);

        register.phoneNumberValidation("030903943343");
        register.phoneNumberValidation("+62309039493");
        register.phoneNumberValidation("62309039493");


    }


    public void usernameValidation(String username) {

        boolean flagUsernameLength = false;
        boolean flagLetterAndNumber = false;

        if (username.length() >= 5 && username.length() <= 20) {
            flagUsernameLength = true;
        } else {
            System.out.println("x Username Length Invalid");
        }


        if (username.matches("^[a-zA-Z0-9]+$")) {
            flagLetterAndNumber = true;
        } else {
            System.out.println("x Username Invalid (contains symbol)");
        }

        boolean result = flagUsernameLength && flagLetterAndNumber;
        System.out.println("Username: " + username);

    }

    public void emailValidation(String email){

        boolean flagAdd = false;
        boolean flagDot = false;

        char[] arr = email.toCharArray();

        for (int i = 0; i < email.length(); i++){

            if (arr[i] == '@'){
                flagAdd = true;
            }
        }

        for (int i = 0; i < email.length(); i++){

            if (arr[i] == '.'){
                flagDot = true;
            }
        }

        if (flagAdd && flagDot){
            System.out.println("Email: " + email);

        }else {
            System.out.println("Invalid Format Email");
        }

    }

    public void passwordValidation(String password){

        boolean flagLength = false;
        boolean flagPassword = false;

        if (password.length() >= 8){
            flagLength = true;
        }

        if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).+$")){
            flagPassword = true;
        }

        if (flagLength && flagPassword){
            System.out.println("Password: " + password);
        }else {
            System.out.println("Format Password tidak sesuai, Minimal 8 Karakter Dan Password harus terdiri dari ada huruf besar, huruf kecil, angka");
        }


    }


    public void ageValidation(int age){

        if (age >= 18 && age <= 100){
            System.out.println("Age: " + age);
        }else {
            System.out.println("Usia hanya berlaku 18 - 100");
        }


    }

    public void phoneNumberValidation(String phoneNumber){

        String formatPhoneNumber = "+62";

        boolean flagDigit = false;
        boolean flagFormat = false;


        if (phoneNumber.length() >= 10){
            flagDigit = true;
        }else {
            System.out.println("Minimal 10 Digit");

        }

        int start = phoneNumber.indexOf("+");

        int totalFormat = start + 3;

        String[] arr = new String[totalFormat];

        String temp = "";

        char[] tempPhoneNumber = phoneNumber.toCharArray();

        for (int i = 0; i < arr.length; i++){

           temp += tempPhoneNumber[i];

           }

        if (temp.equals(formatPhoneNumber)){
            flagFormat = true;

        }

        if (flagDigit && flagFormat){
            System.out.println("Phone Number: " + phoneNumber);
        }



    }


}
