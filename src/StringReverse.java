/**
 * @Class: StringReverse
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: March 14, 2023
 * This program will accept a String value from the user and displays the reverse of that value.
 * In this program, I will declare variables: String, NewString.
 */

import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scn.nextLine();
        char ch;
        String newstr = "";
        for (int i=0; i<str.length(); i++){
            ch= str.charAt(i);
            newstr= ch+newstr;
        }
        System.out.println("Reverse of "+str+" is "+newstr);
        if(str.equals(newstr)){
            System.out.println("String value "+str+" and its reverse "+newstr+" are equal");
        }
        else{
            System.out.println("String value "+str+" and its reverse "+newstr+" are not equal");
        }
    }
}
