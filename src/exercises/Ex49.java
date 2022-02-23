package exercises;

import static utilities.isPrime.primeCheck;

public class Ex49 {
    public static String solve() {
        StringBuilder sol = new StringBuilder();

        for (int i = 1488; i < 10000; i++) {

            if (primeCheck(i)) {
                for (int j = 1; j < 5000; j++) {

                    int second = i + j;
                    int third = i + 2 * j;

                    if (third >= 10000) break;
                    else if (isPrime(second) && isPrime(third)) {
                        if (arePermutations(i, second) && arePermutations(i, third)) {
                            sol.append(i);
                            sol.append(second);
                            sol.append(third);
                        }
                    }
                }
            }
        }
        return sol.toString();
    }

    public static boolean arePermutations(int a, int b) {
        int lena = (int) Math.log10(a) + 1;
        int lenb = (int) Math.log10(b) + 1;

        if (lena != lenb) return false;

        boolean[] used = new boolean[lena];

        for (int i = 0; i < lena; i++) {
            int save = Integer.parseInt(String.valueOf(String.valueOf(a).charAt(i)));

            for (int j = 0; j < lena; j++) {
                int check = Integer.parseInt(String.valueOf(String.valueOf(b).charAt(j)));
                if (save == check && !used[j]) {
                    used[j] = true;
                    break;
                }
            }
        }

        for (int i = 0; i < lena; i++) {
            if (!used[i]) return false;
        }
        return true;
    }

    public static boolean isPrime(long max) {
        for (long i = 2; i <= max / 2; i++) {
            if (max % i == 0) return false;
        }
        return true;
    }
}
