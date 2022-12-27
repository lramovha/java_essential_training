package gross_calculator;

import java.util.*;

public class GradeMessageSwitchExpression {
    public static void main(String [] args){
        System.out.println("Enter your grade letter:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade){
            case "A", "B" -> "Excellent job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work harder";
            case "F" -> "You've failed";
            default -> "Error. Invalid grade";
        };

        System.out.println(message);
    }
}
