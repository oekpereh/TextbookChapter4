/**
 * @Class: StringAndCharacterValue
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 14, 2023
 * This program will prompt the user for a string value and a character value.
 * The program should then find the last occurence of the provided character in the provided string
 * and display the corresponding index.
 * In this program, I will declare the variables: S, and Character.
 */

import java.util.Scanner;
public class StringAndCharacterValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        System.out.println("Enter a character: ");
        char charac = sc.next().charAt(0);
        int last=-1;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==charac)
                last = i;
        }

        System.out.println("last occurrence");
    }
}
