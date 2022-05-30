package week1_MoreExercise_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO2_English_Name_of_the_Last_Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int lastDigit = number % 10;
        String EnglishNumNAme = "";
        
        if (lastDigit == 1) {
            EnglishNumNAme = "one";
        } else if (lastDigit == 2) {
            EnglishNumNAme = "two";
        } else if (lastDigit == 3) {
        } else if (lastDigit == 4) {
            EnglishNumNAme = "four";
        } else if (lastDigit == 5) {
            EnglishNumNAme = "five";
        } else if (lastDigit == 6) {
            EnglishNumNAme = "six";
        } else if (lastDigit == 7) {
            EnglishNumNAme = "seven";
        } else if (lastDigit == 8) {
            EnglishNumNAme = "eight";
        } else if (lastDigit == 9) {
            EnglishNumNAme = "nine";
        } else if (lastDigit == 0){
            EnglishNumNAme = "zero";
        }
        System.out.println(EnglishNumNAme);
        
        
        
        /////////// solution with translating all digits from the number ///////
//        int number = Integer.parseInt(scanner.nextLine());
//
//        String EnglishNumNAme = "";
//        while (number > 0) {
//            int lastDigit = number % 10;
//
//            for (int i = 1; i <= lastDigit ; i++) {
//
//                if (lastDigit == 1) {
//                    EnglishNumNAme = "one";
//                } else if (lastDigit == 2) {
//                    EnglishNumNAme = "two";
//                } else if (lastDigit == 3) {
//                    EnglishNumNAme = "three";
//                } else if (lastDigit == 4) {
//                    EnglishNumNAme = "four";
//                } else if (lastDigit == 5) {
//                    EnglishNumNAme = "five";
//                } else if (lastDigit == 6) {
//                    EnglishNumNAme = "six";
//                } else if (lastDigit == 7) {
//                    EnglishNumNAme = "seven";
//                } else if (lastDigit == 8) {
//                    EnglishNumNAme = "eight";
//                } else if (lastDigit == 9) {
//                    EnglishNumNAme = "nine";
//                } else if (lastDigit == 0) {
//                    EnglishNumNAme = "zero";
//                }
//
//            }
//            System.out.println(EnglishNumNAme);
//            number = number / 10;
//        }
        
        
    }
}
