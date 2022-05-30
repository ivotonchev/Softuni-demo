package week1_MoreExercise_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO5_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTaps = Integer.parseInt(scanner.nextLine());
        String message = "";

        for (int i = 1; i <= numberOfTaps; i++) {
            String input = scanner.nextLine();

            int numberOfDigits = input.length(); // here calculating the number of digits in the string(input).
            char buttonNumber = input.charAt(0); // here we take the first digit from the string(input). (Because they are the same doesn't matter which one we take).

            if (buttonNumber == '2') {
                if (numberOfDigits == 1){
                    message = message + "a";
                }else if (numberOfDigits == 2){
                    message += "b";
                }else if (numberOfDigits == 3) {
                    message += "c";
                }
            }else if (buttonNumber == '3') {
                if (numberOfDigits == 1) {
                    message += "d";
                } else if (numberOfDigits == 2) {
                    message += "e";
                } else if (numberOfDigits == 3) {
                    message += "f";
                }
            }else if (buttonNumber == '4') {
                if (numberOfDigits == 1) {
                    message += "g";
                } else if (numberOfDigits == 2) {
                    message += "h";
                } else if (numberOfDigits == 3) {
                    message += "i";
                }
            }else if (buttonNumber == '5') {
                if (numberOfDigits == 1) {
                    message += "j";
                } else if (numberOfDigits == 2) {
                    message += "k";
                } else if (numberOfDigits == 3) {
                    message += "l";
                }
            }else if (buttonNumber == '6') {
                if (numberOfDigits == 1) {
                    message += "m";
                } else if (numberOfDigits == 2) {
                    message += "n";
                } else if (numberOfDigits == 3) {
                    message += "o";
                }
            }else if (buttonNumber == '7') {
                if (numberOfDigits == 1) {
                    message += "p";
                } else if (numberOfDigits == 2) {
                    message += "q";
                } else if (numberOfDigits == 3) {
                    message += "r";
                } else if (numberOfDigits == 4) {
                    message += "s";
                }
            }else if (buttonNumber == '8') {
                if (numberOfDigits == 1) {
                    message += "t";
                } else if (numberOfDigits == 2) {
                    message += "u";
                } else if (numberOfDigits == 3) {
                    message += "v";
                }
            }else if (buttonNumber == '9') {
                if (numberOfDigits == 1) {
                    message += "w";
                } else if (numberOfDigits == 2) {
                    message += "x";
                } else if (numberOfDigits == 3) {
                    message += "y";
                } else if (numberOfDigits == 4) {
                    message += "z";
                }
            }else if (buttonNumber == '0') {
                message += " ";
            }
        }
        System.out.println(message);


        // another solution //

//        int numbersOfPush = Integer.parseInt(scanner.nextLine());
//        String message = "";
//
//        for (int i = 0; i < numbersOfPush; i++) {
//            String digits = scanner.nextLine();
//            int digitLength = digits.length();
//            char oneDigit = digits.charAt(0);
//            int mainDigit = Character.getNumericValue(oneDigit);
//            int offset = (mainDigit - 2) * 3;
//            if (mainDigit == 8 || mainDigit == 9) {
//                offset = (mainDigit - 2) * 3 + 1;
//            }
//            int letterIndex = offset + digitLength - 1;
//            int letterCode = letterIndex + 97;
//
//
//            char letter = (char) letterCode;
//            if (mainDigit == 0) {
//                letter = (char) (mainDigit + 32);
//            }
//            message += letter;
//
//
//        }
//        System.out.println(message);


    }
}
