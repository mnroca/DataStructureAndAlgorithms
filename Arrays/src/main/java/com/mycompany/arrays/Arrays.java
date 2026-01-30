/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

/**
 *
 * @author Maria Nicole Roca
 */
public class Arrays {

    public static void main(String[] args) {
        // 1. Create the array with the specific values
        int[] numbers = {25, 4, 16, 9, 10};

        // 2. Create a variable to keep track of the total
        // We start at 0 because we haven't added anything yet.
        int sum = 0;

        // 3. Loop through the array to add up the numbers
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        // 4. Print the final result
        System.out.println("The sum of the array is: " + sum);
    }
}
