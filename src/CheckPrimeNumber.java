/**
 * @Class: CheckPrimeNumber
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: February 25, 2023
 * This program will prompt the user for an integer and displays if the provided integer is a prime number or not.
 * In this program, I will declare variables: Number and IsPrime.
 */

import java.util.Scanner;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = sc.nextInt();
        boolean is_Prime = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                is_Prime = false;
            }
        }
        if (is_Prime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}


