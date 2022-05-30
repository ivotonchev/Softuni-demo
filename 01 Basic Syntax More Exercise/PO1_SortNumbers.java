package week1_MoreExercise_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO1_SortNumbers {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          int a = Integer.parseInt(scanner.nextLine());
          int b = Integer.parseInt(scanner.nextLine());
          int c = Integer.parseInt(scanner.nextLine());


        int tmp;

        // ascending order //
//        if (a > b) {
//            tmp = a; a = b; b = tmp; }
//        if (a > c) {
//            tmp = a; a = c; c = tmp; }
//        if (b > c) {
//            tmp = b; b = c; c = tmp; }

        // descending order //
        if (a < b) {
            tmp = a; a = b; b = tmp; }
        if (a < c) {
            tmp = a; a = c; c = tmp; }
        if (b < c) {
            tmp = b; b = c; c = tmp; }

//        System.out.println(a + " " + b + " " + c);
        System.out.printf("%d%n%d%n%d%n", a, b, c);

    }
}
