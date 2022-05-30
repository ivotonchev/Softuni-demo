package week1_Exercise_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO10_Padawan_Equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceLightSabre = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double sumLightSabre = Math.ceil(countStudents * 1.10) * priceLightSabre;
        double sumRobe = countStudents * priceRobe;

        double discountedItems = Math.floor(countStudents * 1.0 / 6) ;
        double sumBelt = countStudents * priceBelt - (discountedItems * priceBelt);

        double totalCost = sumLightSabre + sumRobe + sumBelt;

        if (totalCost <= budget){
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        }else {
            System.out.printf( "George Lucas will need %.2flv more.", totalCost - budget);
        }

    }
}
