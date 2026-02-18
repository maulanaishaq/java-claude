package latihan;

public class ValidatorToolkit {

    public static void main(String[] args) {

        ValidatorToolkit toolkit = new ValidatorToolkit();


        System.out.println(toolkit.isValidEmail("n@."));
        System.out.println(toolkit.isValidAge(101));
        System.out.println(toolkit.isStrongPassword("testasdsadasdsa1"));



    }


    public boolean isValidEmail(String email) {

        boolean flagAdd = false;
        boolean flagDot = false;

        char[] temp = email.toCharArray();

        for (int i = 0; i < temp.length; i++){

            if (temp[i] == '@'){
                flagAdd = true;
            }

            if (temp[i] == '.'){
                flagDot = true;
            }
        }

        if (flagAdd & flagDot){
            return true;
        }


        return false;
    }


    public boolean isValidAge(int age) {

        boolean rangeAge = age >= 18 && age <= 100;

        return rangeAge;

    }

    public boolean isStrongPassword(String password) {

        boolean flagPass = false;
        boolean hasNumber = false;


        if (password.length() >= 8) {
            flagPass = true;
        }

        if (password.matches(".*[0-9].*")) {
            hasNumber = true;
        }


        if (flagPass && hasNumber) {
            return true;
        }

        return false;

    }






}
