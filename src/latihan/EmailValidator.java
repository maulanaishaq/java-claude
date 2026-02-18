package latihan;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        char temp[] = email.toCharArray();

        boolean hasSymbol = false;

        for (int i = 0; i < temp.length; i++){

            if (temp[i] == '@'){
                hasSymbol = true;
            }
        }


        if (hasSymbol){
            System.out.println("Has @ Symbol");


        }else {
            System.out.println("✗ Missing @ symbol");

        }

        boolean hasDot = false;

        for (int i = 0; i < temp.length; i++){

            if (temp[i] == '.'){
                hasDot = true;
            }
        }


        if (hasDot){
            hasDot = true;
            System.out.println("Has Domain");


        }else {
            System.out.println("✗ Missing Domain");

        }

        int indeksTempSymbol = 0;
        int indeksTempDot = 0;

        for (int i = 0; i < temp.length; i++){



            if (temp [i] == '@'){
                indeksTempSymbol = i;
            }

            if (temp [i] == '.'){
               indeksTempDot = i;
            }

        }


        if (hasSymbol && hasDot){

            boolean valid = indeksTempSymbol < indeksTempDot;
            System.out.println("Valid Format " + valid);

        }else {
            System.out.println("Invalid Format ");
        }




        int totalChar = email.length();
        boolean isTotalChar = totalChar >= 6 ;
        System.out.println("Total Character: " + (isTotalChar ? "VALID TOTAL KARAKTER" : "MINIMAL 6 KARAKTER"));






    }
}
