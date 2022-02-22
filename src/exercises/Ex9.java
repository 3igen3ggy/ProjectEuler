package exercises;

public class Ex9 {
    public static int solve() {
        for (int c = 1; c < 1000; c++) {
            for (int b = 1; b < c; b++) {
                for (int a = 1; a < b; a++) {
                    if (a * a + b * b == c * c) {
                        int sum = a + b + c;
                        if (sum == 1000) {
                            return a * b * c;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
