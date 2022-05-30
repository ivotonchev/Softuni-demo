package week1_Exercise_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0.0;
        if (day.equals("Friday")){
            if (typeOfPeople.equals("Students")){
                price = 8.45;
            }
            if (typeOfPeople.equals("Business")){
                price = 10.90;
            }
            if (typeOfPeople.equals("Regular")){
                price = 15;
            }
        }

        if (day.equals("Saturday")){
            if (typeOfPeople.equals("Students")){
                price = 9.80;
            }
            if (typeOfPeople.equals("Business")){
                price = 15.60;
            }
            if (typeOfPeople.equals("Regular")){
                price = 20;
            }
        }

        if (day.equals("Sunday")){
            if (typeOfPeople.equals("Students")){
                price = 10.46;
            }
            if (typeOfPeople.equals("Business")){
                price = 16;
            }
            if (typeOfPeople.equals("Regular")){
                price = 22.50;
            }
        }

        double totalPrice = price * numberOfPeople;
        if (typeOfPeople.equals("Students") && numberOfPeople >= 30){
            totalPrice = totalPrice * 0.85;
        }

        if (typeOfPeople.equals("Business") && numberOfPeople >= 100) {
            totalPrice = totalPrice - (price * 10);
        }

        if (typeOfPeople.equals("Regular") && numberOfPeople >= 10 && numberOfPeople <= 20) {
            totalPrice = totalPrice * 0.95;
        }


        System.out.printf("Total price: %.2f", totalPrice);
    }
}
