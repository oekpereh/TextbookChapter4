/**
 * @Class: SumOfDigits
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: February 25, 2023
 * This program will accept an integer from the user and displays the sum of the digits of the provided integer.
 * In this program, I will declare variables: Number, N, and Sum.
 */

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int n = number;

        int sum=0;

        while(number!=0)
        {
            sum = sum + number%10;
            number = number/10;
        }

        System.out.println("Sum of digits of " + n +" is "+ sum);
    }
}

