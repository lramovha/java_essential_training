package gross_calculator;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String [] args){
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random randomDieRoll = new Random();

        System.out.println("Welcome ti Roll the Die! let's begin...");

        for(int i=1; i<=maxRolls; i++){
            int die = randomDieRoll.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.print(String.format("Roll #%d: You've rolled a %d",i, die));

            if (currentSpace == lastSpace){
                System.out.print("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            }
            else if (currentSpace > lastSpace){
                System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
                break;
            }
            else if (i==maxRolls && currentSpace < lastSpace){
                System.out.println(" You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        lastSpace + " spaces. You lose!");
            }
            else{
                int spaceToGo = lastSpace - currentSpace;
                System.out.print(" You are now on space " + currentSpace +
                        " and have " + spaceToGo + " more to go");
            }

            System.out.println();
        }
    }
}
