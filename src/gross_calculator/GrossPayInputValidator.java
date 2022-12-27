package gross_calculator;

import java.util.Scanner;

public class GrossPayInputValidator {
    public static void main(String [] args){
        int payRate = 15;
        int maxHours = 40;

        System.out.println("How many hours did the employee work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours){
            System.out.println("invalid entry. the hours worked must be between 1 and 40. Try again");
            System.out.println("How many hours did the employee work this week?");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double gross = payRate * hoursWorked;
        System.out.println("Gross pay: $" +gross);
    }
}
