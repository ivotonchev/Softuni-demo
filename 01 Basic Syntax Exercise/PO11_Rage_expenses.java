package week1_Exercise_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO11_Rage_expenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double trashedHeadset = Math.floor(lostGameCount * 1.0 / 2);
        double trashedMouse = Math.floor(lostGameCount * 1.0 / 3);
        double trashedKeyboard = Math.floor(lostGameCount * 1.0 / 6);
        double trashedDisplay = Math.floor(lostGameCount * 1.0 / 12);

        double totalExpenses = trashedHeadset * headsetPrice + trashedMouse * mousePrice + trashedKeyboard * keyboardPrice + trashedDisplay * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}
