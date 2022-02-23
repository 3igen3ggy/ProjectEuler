package exercises;

import java.math.BigInteger;

public class Ex25 {
    public static int solve() {
        BigInteger a = new BigInteger("10");
        BigInteger i = new BigInteger("1");
        BigInteger one = new BigInteger("1");

        while (true) {
            int dig = getDigitCount(fibonacci(i));
            if (dig == 1000) {
                return Integer.parseInt(i.toString());
            }
            i = i.add(one);
        }
    }

    public static int getDigitCount(BigInteger number) {
        double factor = Math.log(2) / Math.log(10);
        int digitCount = (int) (factor * number.bitLength() + 1);
        if (BigInteger.TEN.pow(digitCount - 1).compareTo(number) > 0) {
            return digitCount - 1;
        }
        return digitCount;
    }

    public static BigInteger fibonacci(BigInteger n) {
        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("1");

        if (n.equals(one) || n.equals(two)) {
            return a;
        } else {
            int i = 2;
            while(i < n.intValue()) {
                c = a.add(b);
                b = a;
                a = c;
                i++;
            }
            return c;
        }
    }
}
