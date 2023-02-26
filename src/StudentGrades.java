/**
 * @Class: StudentGrades
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: February 25, 2023
 * This program will prompt the user for student grades, calculates and displays the average grade in the class.
 * In this program, I will declare variables: Average, count, and Number.
 */

import java.util.Scanner;
public class StudentGrades{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double average = 0.0;
        int count = 0;
        System.out.println("Please enter grades and character to stop: ");
        while (true) {
            String input = sc.next();
            double number;
            try {
                number = Double.parseDouble(input);
                average += number;
                count++;
            } catch (Exception e) {

                break;
            }
        }
        average = average / count;
        System.out.println("Average student grade is " + average);

    }
}

