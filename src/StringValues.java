/**
 * @Class: StringValues
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 14, 2023
 * This program prompts the user for two string values.
 * The program should then display if string 1 is greater in length than string 2.
 * In this program, I will declare variables: String1 and String2.
 */


import java.util.Scanner;
public class StringValues {
    public static void main(String[] args){
        String str1 = "";
        String str2 = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two strings: ");

        str1 = sc.nextLine();
        str2 = sc.nextLine();

        if(str1.length()>str2.length()){
            System.out.println("String "+str1+" is longer than String "+str2);
        }
        else if(str1.length()<str2.length()){
            System.out.println("String "+str2+" is longer than String "+str1);
        }
        else{
            System.out.println("String "+str1+" is equal in length to String "+str2);
        }

        if (str1.compareTo(str2) < 0) {
            System.out.println("String "+str1+" appears before String "+ str2+" in lexicographic order");
        } else if (str1.compareTo(str2) == 0) {
            System.out.println(str1 + " is equal to " + str2);
        } else {
            System.out.println("String "+str2+" appears before String "+ str1+" in lexicographic order");
        }

        System.out.println("New sentence created is "+str1+" "+str2);
    }
}
