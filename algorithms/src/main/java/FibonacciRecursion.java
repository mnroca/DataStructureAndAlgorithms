public class FibonacciRecursion {

    // This is the recursive method
    public static int fibonacci(int n) {
        
        // 1. The Base Case
        // We must have a condition to STOP the recursion,
        // otherwise it will run forever and crash (StackOverflowError).
        if (n <= 1) {
            return n;
        }

        // 2. The Recursive Call
        // We call the function itself for (n-1) and (n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        
        // Call our recursive function
        int result = fibonacci(n);
        
        // Print the result
        // (I fixed the string concatenation logic from your snippet)
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}
