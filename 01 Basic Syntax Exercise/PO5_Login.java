package week1_Exercise_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO5_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String username = scanner.nextLine();
      String password = scanner.nextLine();
      String reverse = "";


        for (int i = username.length() - 1; i >= 0; i--) {
           char currentSymbol = username.charAt(i);
            reverse = reverse + currentSymbol;
        }

        boolean isMatched = false;
        int count = 0;
        while (!reverse.equals(password)){
            count ++;
            if(count == 4){
                isMatched = true;
                break;
            }

            System.out.println("Incorrect password. Try again.");
            password = scanner.nextLine();
        }

        if (isMatched) {
            System.out.printf("User %s blocked!", username);
        }else {
            System.out.printf("User %s logged in.", username);
        }
    }
}
