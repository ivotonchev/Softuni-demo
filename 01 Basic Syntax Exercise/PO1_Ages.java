package week1_Exercise_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO1_Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());

        String ageType = "";
        if (age >= 0 && age <=2){
            ageType = "baby";
        }else if (age >= 3 && age <=13){
            ageType = "child";
        }else if (age >= 14 && age <=19){
            ageType = "teenager";
        }else if (age >= 20 && age <=65){
            ageType = "adult";
        }else if (age >= 66){
            ageType = "elder";
        }

        System.out.println(ageType);
    }
}
