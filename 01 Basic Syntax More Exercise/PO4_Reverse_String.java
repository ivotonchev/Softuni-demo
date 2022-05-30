package week1_MoreExercise_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO4_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String reversedString = "";

        // simpler way //
        for (int i = string.length() - 1; i >= 0 ; i--) {
            char currentSymbol = string.charAt(i);
            System.out.print(currentSymbol);
        }


        // another way
//        for (int i = string.length() - 1; i >= 0 ; i--) {
//            char currentSymbol = string.charAt(i);
//            reversedString = reversedString + currentSymbol;
//        }
//        System.out.println(reversedString);
    }
}
