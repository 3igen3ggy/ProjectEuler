package exercises;

import java.math.BigInteger;

public class Ex43 {
    public static String solve() {
        long max = 10000000000L;
        int j = 3003840;

        BigInteger sum = new BigInteger("16695334890");

        for (long i = 9248971292L; i < max; i++) {
            System.out.println("j: " + j + ", i: " + i + ", sum: " + sum);
            if (pandigit(i)) {
                j++;
                int d234 = createNum(digit(i, 1), digit(i, 2), digit(i, 3));
                int d345 = createNum(digit(i, 2), digit(i, 3), digit(i, 4));
                int d456 = createNum(digit(i, 3), digit(i, 4), digit(i, 5));
                int d567 = createNum(digit(i, 4), digit(i, 5), digit(i, 6));
                int d678 = createNum(digit(i, 5), digit(i, 6), digit(i, 7));
                int d789 = createNum(digit(i, 6), digit(i, 7), digit(i, 8));
                int d8910 = createNum(digit(i, 7), digit(i, 8), digit(i, 9));

                if (d234 % 2 == 0 && d345 % 3 == 0 && d456 % 5 == 0 && d567 % 7 == 0 && d678 % 11 == 0 && d789 % 13 == 0 && d8910 % 17 == 0) {
                    sum = sum.add(BigInteger.valueOf(i));
                }
            }
        }
        return sum.toString();
    }

    public static int digit(long num, int d) {
        String numberAux = Long.toString(num);
        return Integer.parseInt(Character.toString(numberAux.charAt(d)));
    }

    public static boolean pandigit (long num) {

        boolean[] digits = new boolean[10];

        for (int i = 0; i <= 9; i++) {
            digits[digit(num, i)] = true;
        }

        for (int i = 0; i <= 9; i++) {
            if (!digits[i]) {
                return false;
            }
        }
        return true;
    }

    public static int createNum(int a, int b, int c ) {
        return a * 100 + b * 10 + c;
    }
}
