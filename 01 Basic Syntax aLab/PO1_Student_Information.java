package week1_aLecture_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO1_Student_Information {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          String name = scanner.nextLine();
          int age = Integer.parseInt(scanner.nextLine());
          double grade = Double.parseDouble(scanner.nextLine());

//        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);

        //another way by using Sring.format
        String result = String.format("Name: %s, Age: %d, Grade: %.2f",name, age, grade);
        System.out.println(result);

    }
}
