import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String userInput = scnr.nextLine();

        int userLength = userInput.length();
        int i = 0;
        int newUserInput;
        char nextCharacter;
        int baseValue;
        long totalDecimal = 0;

        // Account for user number starting with '0x'
        if (userInput.charAt(0) == '0' && userInput.charAt(1) == 'x'){
            i += 2;
        }

        while (i < userLength){

            nextCharacter = userInput.charAt(i);

            if ((nextCharacter == 'F') || (nextCharacter == 'f')) {
                baseValue = 15;
            }
            else if ((nextCharacter == 'E') || (nextCharacter == 'e')) {
                baseValue = 14;
            }
            else if ((nextCharacter == 'D') || (nextCharacter == 'd')) {
                baseValue = 13;
            }
            else if ((nextCharacter == 'C') || (nextCharacter == 'c')) {
                baseValue = 12;
            }
            else if ((nextCharacter == 'B') || (nextCharacter == 'b')) {
                baseValue = 11;
            }
            else if ((nextCharacter == 'A') || (nextCharacter == 'a')) {
                baseValue = 10;
            }
            else {
                baseValue = (int)nextCharacter - 48;
            }

            totalDecimal += baseValue * Math.pow(16, (userLength - i - 1));
            i++;
        }
        System.out.println("Your number is " + totalDecimal + " in decimal");

    }

}
