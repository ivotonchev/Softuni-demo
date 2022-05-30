package week1_Exercise_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO9_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());


        double totalPrice = 0;
        for (int i = 1; i <= orders; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            double orderPrice = ((days * capsuleCount) * price);
            totalPrice = totalPrice + orderPrice;
            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
        }

        System.out.printf("Total: $%.2f%n", totalPrice);
    }
}
