//Write a java program that generates a random number
//between 1 and 100 and then asks the user to guess
//the number using a while loop. The program should give hints
//(e.g., "too high" or "too low") until the user guesses the correct answer.

import java.util.Scanner;
public class HotOrCold {
    public static void main(String[] args){

        int randomValue = (int)(Math.random() * (100 - 1) + 1) + 1;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter your guess, The number is between 1 and 100");

        int guess = input.nextInt();

        if(guess == randomValue) {
            System.out.println("Your guess is correct and the number is " + randomValue);
        }
        else if((guess > randomValue)){
            System.out.println("Too hot");
        }
        else{
            System.out.println("Too cold");
        }
    }
}
