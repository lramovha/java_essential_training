package gross_calculator;

import java.util.*;

public class QuotaChecker {
    public static void main(String [] args){
        int quota = 10;

        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);

        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota){
            System.out.println("Congrats! you've met your quota.");
        }
        else{
            int saleShort = quota - sales;
            System.out.println("You were short of sales by " +saleShort);
        }
    }
}
