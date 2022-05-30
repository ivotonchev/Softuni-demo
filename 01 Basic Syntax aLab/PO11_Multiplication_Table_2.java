package week1_aLecture_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO11_Multiplication_Table_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());


        if (multiplier > 10){
            System.out.printf("%d X %d = %d%n", num, multiplier, num * multiplier);
        }else {
            for (int i = multiplier; i <= 10; i += 1) {
                {
                    System.out.printf("%d X %d = %d%n", num, i, num * i);
                }
            }
        }
    }
}
