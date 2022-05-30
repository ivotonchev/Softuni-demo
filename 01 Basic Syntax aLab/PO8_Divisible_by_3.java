package week1_aLecture_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO8_Divisible_by_3 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <= 100 ; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }

        // another way
//        for (int i = 3; i <= 100 ; i += 3) {
//                System.out.println(i);
//        }

    }
}
