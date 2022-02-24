package exercises;

public class Ex12 {
    public static int solve() {
        int actualTriangleNumber = 1;
        int counter = 2;

        while (true) {
            int divisors = divisors(actualTriangleNumber);
            if (divisors > 500) return actualTriangleNumber;
            else {
                actualTriangleNumber += counter;
                counter++;
            }
        }
    }

    public static int divisors(long n) {
        int num = 1;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) num++;
                else num += 2;
            }
        }
        return num;
    }
}