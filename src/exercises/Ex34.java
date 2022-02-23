package exercises;

public class Ex34 {
    public static long solve() {
        long overallSum = 0;

        for (int i = 24; i < 50000; i++) {
            int len = (int) Math.log10(i) + 1;
            int sum = 0;

            for (int j = 0; j < len; j++) {
                String aux = String.valueOf(i);
                int dig = Integer.parseInt(String.valueOf(aux.charAt(j)));
                sum += factorial(dig);
                if (sum < 0) break;
            }

            if (i == sum) overallSum += i;
        }
        return overallSum;
    }

    public static int factorial(int n) {
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            mult *= i;
        }
        return mult;
    }
}
