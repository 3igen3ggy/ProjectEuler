package exercises;

import static utilities.Fibonacci.FibonacciRecursive;

public class Ex2 {
    public int solve() {
        int sum = 0;
        int i = 1;

        while(FibonacciRecursive(i) < 4000000) {
            if (FibonacciRecursive(i) % 2 == 0) {
                sum += FibonacciRecursive(i);
                }
            i++;
            }
        return sum;
    }
}