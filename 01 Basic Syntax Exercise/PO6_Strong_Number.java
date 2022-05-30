package week1_Exercise_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO6_Strong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number; // this int holds the original value of the number, because later the value of 'number' is changing and goes to zero.

        int sumFactoriel = 0;
        while (number > 0) {
            int lastDigit = number % 10; //selecting the last number
            int factoriel = 1;
            for (int i = 1; i <= lastDigit ; i++) {
                factoriel = factoriel * i;
            }

            sumFactoriel += factoriel;
            number = number / 10; //removing the last number
        }

        if (sumFactoriel == startNumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}


