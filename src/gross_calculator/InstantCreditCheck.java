package gross_calculator;

import java.util.Scanner;

public class InstantCreditCheck {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        scanner.close();

        isUserQualified(salary, creditScore);
    }

    public static void isUserQualified(double salary, int creditScore){
        double requiredSalary = 24000;
        int requiredCreditScore = 700;

        if (creditScore >= requiredCreditScore && salary >= requiredSalary){
            System.out.println("Congrats! You qualify for a credit!");
        }
        else{
            System.out.println("Sorry! You do not qualify for a credit!");
        }
    }
}
