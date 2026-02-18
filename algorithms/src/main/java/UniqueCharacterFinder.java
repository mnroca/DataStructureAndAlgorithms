import java.util.HashMap; // We are importing the tool to make lists
import java.util.Map;     // We are importing the general idea of a Map

public class UniqueCharacterFinder {

    public static void main(String[] args) {
        // This is our Input
        String inputWord = "swiss";
        
        // We call our helper method to do the work
        findFirstNonRepeating(inputWord);
    }

    public static void findFirstNonRepeating(String word) {
        // 1. Create the Hash Table
        // Key = the character (e.g., 's')
        // Value = how many times it appears (e.g., 3)
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // 2. Iterate (loop) over the string to fill the map
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i); // Get the letter at this spot
            
            // Logic: Get current count, or 0 if it's new, then add 1
            if (frequencyMap.containsKey(c)) {
                int currentCount = frequencyMap.get(c);
                frequencyMap.put(c, currentCount + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }

        // 3. Iterate over the string again to find the answer
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            
            // Check if the count is exactly 1
            if (frequencyMap.get(c) == 1) {
                System.out.println("The first non-repeating character is: " + c);
                return; // Stop the program immediately, we found it!
            }
        }

        // 4. Output if nothing is found
        System.out.println("No non-repeating character found.");
    }
}
