package gross_calculator;

import java.util.Scanner;

public class ChangeForDollarGame {
    public static void main(String [] args){
        int dollar = 1;
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter your number of pennies:");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels:");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes:");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters:");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double total = (numOfPennies * penny) + (numOfNickels * nickel) + (numOfDimes * dime) + (numOfQuarters * quarter);

        if (total < dollar){
            double amountShort = dollar - total;
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " change");
        }
        else if (total > dollar) {
            double amountOver = total - dollar;
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " change");
        }
        else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }


    }
}
