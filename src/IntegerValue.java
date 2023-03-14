/**
 * @Class: IntegerValue
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 14, 2023
 * This program prompts the user for an integer value.
 * The program should then calculate and print the factorial of the user provided name.
 *
 */

import java.util.Scanner;
public class IntegerValue {
    public static void main(String[] args){
        int n,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
