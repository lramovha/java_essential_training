package gross_calculator;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String [] args){
        int numOfStudents = 24;
        int numOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<numOfStudents; i++){
            double total=0;
            for (int j=0; j<numOfTests; j++){
                System.out.println("Enter the score for test #" +(j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total / numOfTests;
            System.out.println("The test average for student #" +(i+1)+ " is "+average);
        }
    }
}
