package week1_aLecture_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO2_Passed {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          double grade = Double.parseDouble(scanner.nextLine());

          if (grade >= 3.00) {
              System.out.println("Passed!");
          }
    }
}
