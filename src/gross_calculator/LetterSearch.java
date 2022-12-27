package gross_calculator;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class LetterSearch {
    public static void main(String [] args){
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        scanner.close();

        boolean letterFound = false;

        for (int i=0; i<text.length(); i++) {
            if (text.charAt(i) == 'A' || text.charAt(i) == 'a') {
                letterFound = true;
                System.out.println("Text contains letter 'A'! ");
                break;
            }
        }
        if (!letterFound){
            System.out.println("Text does not contain letter 'A' ");
        }
    }
}
