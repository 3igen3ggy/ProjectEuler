package exercises;

public class Ex33 {
    public static int solve() {
        int num = 1;
        int den = 1;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j < i; j++) {
                for (int k = 1; k < j; k++) {
                    if (10 * i * k - i * j == 9 * k * j) {
                        int n = 10 * k + i;
                        int d = 10 * i + j;
                        num *= k;
                        den *= j;
                    }
                }
            }
        }
        return den / num;
    }
}
