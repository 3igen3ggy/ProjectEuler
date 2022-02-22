package exercises;

public class Ex3{
    public long solve() {
        long num = 600851475143L;
        long start = num / 2;
        for (long i = start; i > 2; i--) {
            if (num % i == 0 && utilities.isPrime.primeCheck(i)) {
                return i;
            }
        }
        return -1;
    }
}