package exercises;

import java.util.ArrayList;
import static utilities.EratosthenesSieve.Sieve;

public class Ex50 {
    public static int solve() {
        int n = 1000000;
        int maxSum = 0;
        int maxCounter = 0;
        boolean[] sieve = Sieve(n);
        ArrayList<Integer> primesList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (sieve[i]) primesList.add(i);
        }
        int len = primesList.size();

        for (int i = 0; i < len; i++) {
            int counter = 0;
            int sum = 0;
            for (int j = i; j < len; j++) {
                sum += primesList.get(j);
                counter++;
                if (sum > n) break;
                if (counter > maxCounter && sieve[sum]) {
                    maxCounter = counter;
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}