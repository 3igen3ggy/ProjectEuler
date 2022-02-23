package exercises;

import static utilities.isPandigital.isPandigit;

public class Ex41 {
    public static int solve() {
        int maxPrime = 987654321 + 1;
        int max = 0;

        boolean[] primes = new boolean[maxPrime];

        for (int i = 2; i < maxPrime; i++) {
            primes[i] = true;
        }

        for (int i = 2; i < maxPrime; i++) {
            if (primes[i]) {
                if (isPandigit(i) && i > max) {
                    max = i;
                }
                for (int j = 2 * i; j < maxPrime; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i < maxPrime; i++) {
            primes[i] = true;
        }

        return max;
    }
}
