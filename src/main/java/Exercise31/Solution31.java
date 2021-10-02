/*
 *  UCF COP3330 Fall 2021 Assignment 31 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise31;

//Imports all java util
import java.util.*;

public class Solution31 {
    public static void main(String[] args) {
        //Declares the variables we will be using
        double BPM;
        int Percentage;

        //Sets up our scanner
        Scanner ScanWord = new Scanner(System.in);

        //Using a try so we can catch exceptions (non digit entries)
        try {
            //Prompts user for Resting Heart Rate
            System.out.println("Please enter your Resting Heart Rate: ");
            //Scans user input to UserRHR
            double UserRHR = ScanWord.nextDouble();
            //Prompts user for Age
            System.out.println("Please enter your Age: ");
            //Scans user input to UserAge
            double UserAge = ScanWord.nextDouble();
            //Sets up the top part of our table by printing out Resting pulse and age
            System.out.println("Resting Pulse: " + UserRHR + "\t\tAge: " + UserAge);
            //Sets up the top part of our table by printing out Intensity and Rate
            System.out.println("Intensity|\tRate");
            //Just some dashes to visually match the example
            System.out.println("---------|--------");
            //For loop that sets the percentage to 55, and keeps going until 95, adds 5 for each increment
            for (Percentage = 55; Percentage <= 95; Percentage = Percentage + 5) {
                //Calculates the BPM side of the table
                BPM = (((220 - UserAge) - UserRHR) * Percentage/100) + UserRHR;
                //Rounds the BPM
                BPM = Math.round(BPM);
                //Converts BPM from double to int
                int rate1 = (int)BPM;
                //Prints out the table with appropiate spacing
                System.out.println(Percentage + "%" + "\t\t | " + rate1 + " bpm");
            }
        }
        //Prints out an error message if non digit number
        catch(Exception exception) {
            System.out.println("Invalid Input");
        }
    }
}


