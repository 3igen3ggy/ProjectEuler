package exercises;

public class Ex39 {
    public static int solve() {
        int max = 0;
        int remP = 0;
        int thousand = 1000;

        for (int p = 1; p <= thousand; p++) {
            int counter = 0;

            for (int i = 1; i <= thousand; i++) {
                for (int j = i; j <= thousand; j++) {
                    double c = Math.sqrt(i * i + j * j);

                    if (isWhole(c) && i + j + c == p) {
                        counter++;
                    }
                }
            }

            if (counter > max) {
                max = counter;
                remP = p;
            }
        }
        return remP;
    }

    public static boolean isWhole(double a) {
        int b = (int) a;
        return a == b;
    }
}
