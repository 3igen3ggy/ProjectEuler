package exercises;

public class Ex14 {
    public static long solve() {
        long start = 2;
        long i;
        long startMax = 0;
        long chain;
        long maxChain = 0;

        while (start < 1000000) {
            chain = 0;
            i = start;
            do {
                i = collatz(i);
                chain++;
            } while (i != 1);

            if (chain > maxChain) {
                maxChain = chain;
                startMax = start;
            }
            start++;
        }
        return startMax;
    }

    public static long collatz(long i) {
        if (i % 2 == 0) {
            i = i / 2;
        } else if (i % 2 == 1) {
            i = 3 * i + 1;
        }
        return i;
    }
}
