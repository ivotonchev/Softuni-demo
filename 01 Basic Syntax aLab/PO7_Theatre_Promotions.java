package week1_aLecture_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO7_Theatre_Promotions {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          String dayType = scanner.nextLine();
          int age = Integer.parseInt(scanner.nextLine());

          boolean isNotValid = false;
          int price = 0;
          if (dayType.equals("Weekday")){
              if (age >= 0 && age <= 18){
                  price = 12;
              } else if (age > 18 && age <= 64){
                  price = 18;
              }else if (age > 64 && age <= 122){
                  price = 12;
              }
          }

        if (dayType.equals("Weekend")){
            if (age >= 0 && age <= 18){
                price = 15;
            } else if (age > 18 && age <= 64){
                price = 20;
            }else if (age > 64 && age <= 122){
                price = 15;
            }
        }

        if (dayType.equals("Holiday")){
            if (age >= 0 && age <= 18){
                price = 5;
            } else if (age > 18 && age <= 64){
                price = 12;
            }else if (age > 64 && age <= 122){
                price = 10;
            }
        }


//        if (price!=0){
//            System.out.printf("%d$", price);
//        }else {
//            System.out.println("Error!");
//        }

        if (age < 0 || age > 122){
            System.out.println("Error!");
        }else {
            System.out.printf("%d$", price);
        }



        ///////////////////////////////////// with boolean //////////////////////

//        if (dayType.equals("Weekday")){
//            if (age >= 0 && age <= 18){
//                price = 12;
//            } else if (age > 18 && age <= 64){
//                price = 18;
//            }else if (age > 64 && age <= 122){
//                price = 12;
//            }else {
//                isNotValid = true;
//            }
//        }
//
//        if (dayType.equals("Weekend")){
//            if (age >= 0 && age <= 18){
//                price = 15;
//            } else if (age > 18 && age <= 64){
//                price = 20;
//            }else if (age > 64 && age <= 122){
//                price = 15;
//            }else {
//                isNotValid = true;
//            }
//        }
//
//        if (dayType.equals("Holiday")){
//            if (age >= 0 && age <= 18){
//                price = 5;
//            } else if (age > 18 && age <= 64){
//                price = 12;
//            }else if (age > 64 && age <= 122){
//                price = 10;
//            }else {
//                isNotValid = true;
//            }
//        }
//
//
//        if (isNotValid){
//            System.out.println("Error!");
//        }else {
//            System.out.printf("%d$", price);
//        }

    }
}
