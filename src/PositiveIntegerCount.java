//Write a java program that prompts the user to enter a positive integer
//and then counts from 1 up to that number using a while loop.

import java.util.Scanner;
public class PositiveIntegerCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = input.nextInt(); //7

        int newNumber = 1;//newNumber is 0

        while (newNumber <= number) { // 1 <= 7 true
            System.out.println(newNumber);
            newNumber++;
        }
    }
}
