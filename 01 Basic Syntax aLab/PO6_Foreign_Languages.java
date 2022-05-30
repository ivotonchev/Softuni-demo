package week1_aLecture_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class PO6_Foreign_Languages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        String language = "";
        switch (country) {
            case "England":
            case "USA":
                language = "English";
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                language = "Spanish";
                break;
            default:
                language = "unknown";
        }
        System.out.println(language);
    }
}
