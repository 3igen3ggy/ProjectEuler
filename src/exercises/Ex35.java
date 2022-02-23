package exercises;

public class Ex35 {
    public static int solve() {
        int n = 1000001;
        int counter = 0;

        boolean[] primes = new boolean[n];
        for (int i = 2; i < n; i++) {
            primes[i] = true;
        }

        for (int i = 2; i< n; i++) {
            if (primes[i]) {
                for (int j = 2 * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i < 1000000; i++) {
            int len = (int) Math.log10(i) + 1;
            if (primes[i]) {
                int aux = i;
                boolean flag = false;
                for (int j = 0; j < len; j++) {
                    aux = roll(aux);
                    if (!primes[aux]) {
                        break;
                    }
                    if (j == len - 1) flag = true;
                }
                if (flag) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int roll(int n) {
        int len = (int) Math.log10(n) + 1;

        String aux = String.valueOf(n);
        String aux2 = aux.substring(0, len - 1);
        String aux3 = aux.substring(len - 1, len).concat(aux2);

        return Integer.parseInt(aux3);
    }
}
