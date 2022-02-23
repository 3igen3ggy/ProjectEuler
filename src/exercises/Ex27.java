package exercises;

public class Ex27 {
    public static int solve() {
        int consec = 0;
        int max = 0;
        int amax = 0;
        int bmax = 0;

        for (int a = -999; a < 1000; a++) {
            for (int b = -1000; b <= 1000; b++) {
                int x = 0;
                while (true) {
                    if (isPrime(f(a,b,x))) {
                        consec++;
                        x++;
                        if (consec > max) {
                            max = consec;
                            amax = a;
                            bmax = b;
                        }
                    } else {
                        consec = 0;
                        break;
                    }
                }
            }
        }
        return amax * bmax;
    }

    public static boolean isPrime(long a) {
        long d = 2;
        a = Math.abs(a);
        if (a == 0 || a == 1) {
            return false;
        }
        while (d <= a / 2) {
            if (a % d == 0) {
                return false;
            }
            d++;
        }
        return true;
    }
    public static int f(int a, int b, int x) {
        return x * x + a * x + b;
    }
}
