/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author Maria Nicole Roca
 */
public class CheckArrayValue {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Step 1: Declare array
        int valueToCheck = 30;            // Step 2: Value to find
        boolean containsValue = false;     // Step 3: Track if found
        
        // Step 4: Check if array contains the value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToCheck) {
                containsValue = true; 
                break; // Stop searching once found
            }
        }
        
        // Step 5: Display result
        if (containsValue)
            System.out.println(valueToCheck + " is found in the array.");
        else
            System.out.println(valueToCheck + " is NOT found in the array.");
                
    }
    
}
