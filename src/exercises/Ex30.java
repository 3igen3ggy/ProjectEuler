package exercises;

public class Ex30 {
    public static int solve() {
        int sum = 0;
        for (int i = 2; i < 1000000; i++) {
            if (isSumOfPow(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isSumOfPow(long num) {
        int len = (int) Math.log10(num) + 1;

        long sum = 0;

        for (int i = 0; i < len; i++) {
            int aux = Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
            sum += aux * aux * aux * aux * aux;
        }

        return sum == num;
    }
}
