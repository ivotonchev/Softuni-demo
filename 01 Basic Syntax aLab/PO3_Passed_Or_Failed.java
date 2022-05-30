package week1_aLecture_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO3_Passed_Or_Failed {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          double grade = Double.parseDouble(scanner.nextLine());

          if (grade >= 3.00) {
              System.out.println("Passed!");
          }else {
              System.out.println("Failed!");
          }
    }
}
