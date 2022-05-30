package week1_aLecture_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO4_Back_In_30_Minutes {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          int intiHours = Integer.parseInt(scanner.nextLine());
          int initMinutes = Integer.parseInt(scanner.nextLine());

          int allMinutes = (intiHours * 60) + initMinutes + 30;

          int hours = allMinutes / 60;
          int minutes = allMinutes % 60;


          if (hours > 23){
             hours = 0;
          }

              System.out.printf("%d:%02d",hours, minutes);


    }
}
