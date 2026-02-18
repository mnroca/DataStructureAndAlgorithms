public class MaxFinder {

    public static void main(String[] args) {
        // This is our Input: An array of numbers
        // An array is just a list of items stored together
        int[] numbers = {12, 45, 7, 89, 23};
        
        // We run our logic
        int result = findMaximum(numbers);
        
        // This is our Output
        System.out.println("The maximum number is: " + result);
    }

    public static int findMaximum(int[] arr) {
        // SAFETY CHECK: If the list is empty, we can't find a max!
        if (arr.length == 0) {
            System.out.println("The array is empty.");
            return 0; 
        }

        // 1. Initialize the "King"
        // We take the number at index 0 (the first spot)
        int maxVal = arr[0];

        // 2. Loop through the list
        // i starts at 1 because we already took index 0 as the maxVal
        for (int i = 1; i < arr.length; i++) {
            
            // 3. The Comparison (The "IF" control structure)
            // arr[i] is the challenger
            if (arr[i] > maxVal) {
                // If challenger is bigger, update maxVal
                maxVal = arr[i];
            }
        }

        // Return the winner
        return maxVal;
    }
}
