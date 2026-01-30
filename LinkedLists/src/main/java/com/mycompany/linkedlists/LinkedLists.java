/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linkedlists;

import java.util.LinkedList;

/**
 *
 * @author Maria Nicole Roca
 */
public class LinkedLists {

    public static void main(String[] args) {
        // Step 1: Create a LinkedList of fruits
        LinkedList<String>fruits = new LinkedList<>();
        
        // Step 2: Add elements to the list
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        
        // Step 3: PRint the original list
        System.out.println("Original list: " + fruits);
        
        // Step 4: Add "orange" to the beginning of the list
        fruits.addFirst("orange");
        
        // Step 5: Print the list after adding "orange"
        System.out.println("After adding orange: " + fruits);
        
        // Step 6: Remove an element (remove item at index 2)
        fruits.remove(2);
        
        // Step 7: Print the list after removal
        System.out.println("After removing element at index 2: " + fruits);
        
        // Step 8: Get an element at a specific index
        String fruitAtIndex1 = fruits.get(1);
        System.out.println("Element at index 1: " + fruitAtIndex1);
        
        // Step 9: Print the size of the list
        System.out.println("Size of the list: " + fruits.size());
    }
}
