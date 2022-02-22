package exercises;

public class Ex3{
    public long solve() {
        long num = 600851475143L;
        long max = 0L;
        long start = num / 2;
        for (long i = 2; i <= num / 2; i++) {
            if (num % i == 0 && utilities.isPrime.primeCheck(i) && i > max) {
                max = i;
                num /= i;
                i = 2;
            }
        }
        if (utilities.isPrime.primeCheck(num) && num > max) {
            max = num;
        }
        return max;
    }
}