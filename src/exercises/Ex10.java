package exercises;

import static utilities.EratosthenesSieve.Sieve;
public class Ex10 {
    public static long solve() {
        boolean[] sieve = Sieve(2000000);
        long sum = 0L;
        for (int i = 2; i < 2000000; i++) {
            if (sieve[i]) sum += i;
        }
        return sum;
    }
}
