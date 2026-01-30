/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author Maria Nicole Roca
 */
import java.util.Scanner;

public class UserArraySum {
    public static void main(String[] args) {
        int[] arr = new int[5];     // Step 1; Create array
        Scanner input = new Scanner(System.in);
        
        // Step 2&3: Prompt user for input
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        
        int sum = 0;               // Step 4: Initialize sum
        
        // Step 5: Calculate sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        //Step 6: Display result
        System.out.println("Sum of all elements: " + sum);
    }
    
}
