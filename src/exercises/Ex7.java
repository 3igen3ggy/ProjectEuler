package exercises;

import static utilities.isPrime.primeCheck;

public class Ex7 {
    public static int solve() {
        int i = 1;
        int n = 2;
        while (true) {
            if (primeCheck(n)) {
                i++;
            }
            n++;
            if(i == 10001) {
                return n;
            }
        }
    }
}
