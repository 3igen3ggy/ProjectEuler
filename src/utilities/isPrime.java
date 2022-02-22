package utilities;

public class isPrime {
    public static boolean primeCheck(long n) {
        if (n <= 1) return false;
        long i = 2L;
        while(i <= n / 2) {
            if (n % i == 0) return false;
            i++;
        }
        return true;
    }
}
