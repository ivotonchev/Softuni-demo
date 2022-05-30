package week1_aLecture_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO9_Sum_of_Odd_Numbers {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          int n = Integer.parseInt(scanner.nextLine());

          int sum = 0;
        for (int i = 1; i <= n * 2 ; i++) {
            if (i % 2 != 0){
                sum = sum + i;
                System.out.println(i);
            }
        }
                    System.out.printf("Sum: %d", sum);
    }
}
