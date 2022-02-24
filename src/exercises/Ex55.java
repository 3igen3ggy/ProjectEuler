package exercises;

import java.math.BigInteger;

public class Ex55 {
    public static int solve() {
        int lychrel = 0;
        int nonLychrel = 0;

        for (int i = 10; i < 10000; i++) {
            BigInteger check = new BigInteger(String.valueOf(i));

            if (isLychrel(check)) {
                lychrel++;
            } else {
                nonLychrel++;
            }
        }
        return lychrel;
    }

    public static boolean isLychrel (BigInteger l) {
        int max = 50;
        int i = 0;
        BigInteger sum;
        while (i < max) {
            sum = l.add(rev(l));
            if (isPalindrome(sum)) {
                return false;
            } else {
                l = sum;
            }
            i++;
        }
        return true;
    }

    public static boolean isPalindrome(BigInteger l) {
        String aux = String.valueOf(l);
        int d = digits(l);
        int i = 0;

        while (i < d / 2) {
            if (digit(l, i) != digit (l, d - 1 - i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int digit(BigInteger l, int d) {
        String aux = l.toString();
        return Integer.parseInt(String.valueOf(aux.charAt(d)));
    }

    public static int digits(BigInteger l) {
        String aux = l.toString();
        return aux.length();
    }

    public static BigInteger rev(BigInteger l) {
        int d = digits(l);
        String rev = "";

        for (int i = 0; i < d; i++) {
            rev = rev.concat(String.valueOf(digit(l,d - 1 - i)));
        }

        return new BigInteger(rev);
    }
}
