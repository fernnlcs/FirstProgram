/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivetypesjava;

import java.util.Scanner;

/**
 *
 * @author temp
 */
public class PrimitiveTypesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
         * FLOAT 
         */
        
        // Setting a random value to be used in the following examples
        float grade = 8.5f;
        
        // Concatenating
        System.out.println("Your grade is " + grade);
        
        // Using printf
        System.out.printf("Your grade is also %.2f\n\n", grade);
        
        /*
         * STRING
         */
        
        // Setting a random value to be used in the following examples
        String name = "Fernando";
        
        // Using printf
        System.out.printf("%s's grade is %.1f\n", name, grade);
        
        // Using format
        System.out.format("%s's grade is also %.1f\n\n", name, grade);
        
        /*
         * INPUT 
         */
        
        // Connecting System.in to Scanner (keyboard)
        Scanner keyboard = new Scanner(System.in);
        
        // Reading values from keyboard
        System.out.print("Student's name: ");
        name = keyboard.nextLine();
        System.out.print("Student's grade: ");
        grade = keyboard.nextFloat();
        
        // Using format
        System.out.format("%s's grade is %.1f\n", name, grade);
    }
    
}
