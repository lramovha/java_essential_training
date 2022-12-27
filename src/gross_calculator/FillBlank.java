package gross_calculator;

import java.util.*;

public class FillBlank {
    public static void main(String [] args){
        String season;
        int wholeNumber;
        String adjective;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the season of the year: ");
        season = scanner.nextLine();

        System.out.println("Enter an adjective: ");
        adjective = scanner.next();

        System.out.println("Enter the number of drinks");
        wholeNumber = scanner.nextInt();

        scanner.close();

        System.out.println("On a " +adjective+ " " +season+ " day,\nI drink a minimum of " +wholeNumber+ " cups\nof coffee.");

    }
}
