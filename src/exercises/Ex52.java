package exercises;

import java.util.ArrayList;

public class Ex52 {
    public static long solve() {
        for (long i = 10; i < 100000000L; i++) {
            long a = 2 * i;
            long b = 3 * i;
            long c = 4 * i;
            long d = 5 * i;
            long e = 6 * i;

            if (digitsCheck(i, a)) {
                if (digitsCheck(i, b)) {
                    if (digitsCheck(i, c)) {
                        if (digitsCheck(i, d)) {
                            if (digitsCheck(i, e)) {
                                return i;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static boolean digitsCheck(long a, long b) {
        int aDigits = digits(a);
        int bDigits = digits(b);

        if (aDigits != bDigits) {
            return false;
        }

        ArrayList<Integer> aDigList = new ArrayList<>();

        for (int i = 0; i < aDigits; i++) {
            aDigList.add(digit(a, i));
        }

        int i = 0;

        while (i < aDigits) {
            if (aDigList.contains(digit(b, i))) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int digit(long a, int d) {
        String aux = String.valueOf(a);
        return Integer.parseInt(String.valueOf(aux.charAt(d)));
    }

    public static int digits(long a) {
        return (int) Math.log10(a) + 1;
    }
}
