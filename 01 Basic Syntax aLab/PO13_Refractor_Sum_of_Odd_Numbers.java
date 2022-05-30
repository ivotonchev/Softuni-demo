package week1_aLecture_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO13_Refractor_Sum_of_Odd_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 1; i <= n * 2; i += 2) {
            System.out.println(i);
            sum += i;
        }
        System.out.printf("Sum: %d%n", sum);

    }
}
