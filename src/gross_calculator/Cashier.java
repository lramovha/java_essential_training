package gross_calculator;

import java.util.Scanner;

public class Cashier {
    public static void main(String [] args){
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();

        double totalPrice = 0;

        for (int i = 0; i < quantity; i++){
            System.out.println("Enter the price of the item:");
            double price = scanner.nextDouble();
            totalPrice = totalPrice + price;
        }
        scanner.close();
        System.out.println("Your Total price is $" + totalPrice);
    }
}
