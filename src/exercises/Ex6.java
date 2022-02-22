package exercises;

public class Ex6 {
    public static long solve() {
        int sumOfSquares = 0;
        int squareOfSum;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sumOfSquares += i * i;
        }

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        squareOfSum = sum * sum;
        return (squareOfSum - sumOfSquares);
    }
}
