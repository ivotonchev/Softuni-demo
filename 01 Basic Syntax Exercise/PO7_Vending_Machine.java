package week1_Exercise_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO7_Vending_Machine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double sum = 0;
        while (!command.equals("Start")) {
            double money = Double.parseDouble(command);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2) {
                sum += money;
            }else {
                System.out.printf("Cannot accept %.2f%n", money);
            }


            command = scanner.nextLine();
        }


        String product = scanner.nextLine();
        while (!product.equals("End")){


            switch (product){
                case "Nuts":
                    if (sum < 2.0){
                        System.out.println("Sorry, not enough money");
                    }else {
                        sum -= 2;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;

                case "Water":
                    if (sum < 0.7){
                        System.out.println("Sorry, not enough money");
                    }else {
                        sum -= 0.7;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;

                case "Crisps":
                    if (sum < 1.5){
                        System.out.println("Sorry, not enough money");
                    }else {
                        sum -= 1.5;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;

                case "Soda":
                    if (sum < 0.8){
                        System.out.println("Sorry, not enough money");
                    }else {
                        sum -= 0.8;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;

                case "Coke":
                    if (sum < 1.0){
                        System.out.println("Sorry, not enough money");
                    }else {
                        sum -= 1;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;

                default:
                    System.out.println("Invalid product");
                    break;
            }


            product = scanner.nextLine();
        }


        System.out.printf("Change: %.2f", sum);
    }
}
