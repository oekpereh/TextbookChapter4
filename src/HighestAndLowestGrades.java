/**
 * @Class: HighestAndLowestGrades
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 13, 2023
 * This program will prompt the user for students grades and displays the highest and lowest grades in the class.
 * In this program, I will declare the variables: Grade, LowGrade, and HighGrade.
 */

import java.util.Scanner;
public class HighestAndLowestGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student grades. Enter a character to stop.");
        int grade = input.nextInt();
        double lowGrade = Double.MAX_VALUE;
        double higGrade = Double.MIN_VALUE;
        while (!Character.isDigit(grade)) {
            if (grade == 0) {
                break;
            }
            if (grade < lowGrade) {
                lowGrade = grade;
            }
            if (grade > higGrade) {
                higGrade = grade;
            }
            try {
                grade = input.nextInt();
            } catch (Exception ex) {
                break;
            }
            System.out.println("The highest grade is: " + higGrade);
            System.out.println("The lowest grade is: " + lowGrade);
        }
    }
}
