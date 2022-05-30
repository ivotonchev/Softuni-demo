package week1_MoreExercise_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO3_Gaming_Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double originalBalance = balance;
        String command = scanner.nextLine();

        double spend = 0;
        while (!command.equals("Game Time")){
            String gameName = command;

            if (gameName.equals("OutFall 4") ||
                    gameName.equals("CS: OG") ||
                    gameName.equals("Zplinter Zell") ||
                    gameName.equals("Honored 2") ||
                    gameName.equals("RoverWatch") ||
                    gameName.equals("RoverWatch Origins Edition")){

                switch (gameName){
                    case "OutFall 4":
                        if (balance - 39.99 < 0){
                            System.out.println("Too Expensive");
                    }else {
                            balance = balance - 39.99;
                            spend += 39.99;
                            System.out.printf("Bought %s%n",gameName);
                        }
                        break;
                    case "CS: OG":
                        if (balance - 15.99 < 0){
                            System.out.println("Too Expensive");
                        }else {
                            balance = balance - 15.99;
                            spend += 15.99;
                            System.out.printf("Bought %s%n",gameName);
                        }
                        break;
                    case "Zplinter Zell":
                        if (balance - 19.99 < 0){
                            System.out.println("Too Expensive");
                        }else {
                            balance = balance - 19.99;
                            spend += 19.99;
                            System.out.printf("Bought %s%n",gameName);
                        }
                        break;
                    case "Honored 2":
                        if (balance - 59.99 < 0){
                            System.out.println("Too Expensive");
                        }else {
                            balance = balance - 59.99;
                            spend += 59.99;
                            System.out.printf("Bought %s%n",gameName);
                        }
                        break;
                    case "RoverWatch":
                        if (balance - 29.99 < 0){
                            System.out.println("Too Expensive");
                        }else {
                            balance = balance - 29.99;
                            spend += 29.99;
                            System.out.printf("Bought %s%n",gameName);
                        }
                        break;
                    case "RoverWatch Origins Edition":
                        if (balance - 39.99 < 0){
                            System.out.println("Too Expensive");
                        }else {
                            balance = balance - 39.99;
                            spend += 39.99;
                            System.out.printf("Bought %s%n",gameName);
                        }
                        break;
                }

                if (balance <= 0){
                    System.out.println("Out of money!" );
                    return;
                }
            }else{
                System.out.println("Not Found");
            }


            command = scanner.nextLine();
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spend, originalBalance - spend);
    }
}
