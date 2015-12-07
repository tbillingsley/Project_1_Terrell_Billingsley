/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my_package;

/**
 *
 * @author Terrell
 */
import java.util.Scanner;
public class Project_1_Terrell_Billingsley {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare variables
        float length, width, area, perimeter;
        String choice = "y"; 
        //create Scanner object
        Scanner sc = new Scanner(System.in);
        //display welcome message
        System.out.println("Welcome to the Area and Perimeter Calculator\n");
        
        while (choice.equalsIgnoreCase("y"))
        { //Beginning of While Loop 
        //get length and width from user
        System.out.print("Enter length: "); //prompt user to enter length
        length = sc.nextFloat(); //read user input and place the input in length variable
        System.out.print("Enter width: "); //prompt user to enter width
        width = sc.nextFloat(); //read user input and place the input in the width variable
        
        //calculate the area and the parimeter
        area = width * length;
        perimeter = 2 * (width+length);
        
        //display the area and perimeter
        System.out.println("Area = \t\t" + area);
        System.out.println("Perimeter= \t" + perimeter);
        //prompt the user if they want to continue
        System.out.print("Continue? (Y/N); ");
        choice = sc.next(); //read user response
        System.out.println(); //Print a blank line
        
        } //End of While Loop
    }
}