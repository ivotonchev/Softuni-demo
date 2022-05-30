package week1_Exercise_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO4_Print_and_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = startNumber; i <= endNumber ; i++) {
            sum += i;
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
