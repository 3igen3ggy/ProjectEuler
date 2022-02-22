package utilities;

public class Fibonacci {
    public static long FibonacciRecursive(int n) {
            if (n == 1) {
                return 1L;
            } else if (n == 2) {
                return 2L;
            } else {
                return FibonacciRecursive(n - 1) + FibonacciRecursive(n - 2);
            }
        }
}
