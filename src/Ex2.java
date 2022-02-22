public class Ex2 {
    public int solve() {
        int sum = 0;
        int i = 1;
        while(fibonacci(i) < 4000000) {
            if (fibonacci(i) % 2 == 0) {
                sum += fibonacci(i);
                }
            i++;
            }
        return sum;
    }

    private int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}