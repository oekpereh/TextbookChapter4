/**
 * @Class: FibonacciSeries
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 14, 2023
 * This program will print first 30 values in the Fibonacci Series.
 * In this program, I will declare variables: Num1, Num2, and N.
 */

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        int num1 = 0, num2 = 1, n;
        for (int i = 0; i < 30; i++) {
            System.out.print(num1);
            n = num1 + num2;
            num1 = num2;
            num2 = n;
            if (i != 29) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
