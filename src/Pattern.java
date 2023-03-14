/**
 * @Class: Pattern
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 14, 2023
 * This program will create the following pattern
 * In this program, I will declare variable: Rows.
 */


import java.util.Scanner;
public class Pattern {
    public static void main(String[] args){
        int rows = 6;
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
