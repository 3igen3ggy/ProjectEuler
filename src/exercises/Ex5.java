package exercises;

public class Ex5 {
    public static int solve() {
        int i = 1;
        while (true) {
            for (int j = 2; j <= 20; j++) {
                if (i % j == 0) {
                    if (j == 20) return i;
                } else break;
            }
            i++;
        }
    }
}
