package gross_calculator;

import java.util.Scanner;

public class InstantCreditCheckReturn {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        scanner.close();

        boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);
    }

    public static boolean isUserQualified(double salary, int creditScore){
        double requiredSalary = 24000;
        int requiredCreditScore = 700;

        if (creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if (isQualified == true){
            System.out.println("Congrats! You've qualified for a credit.");
        }
        else{
            System.out.println("Sorry! You don't qualify.");
        }
    }
}
