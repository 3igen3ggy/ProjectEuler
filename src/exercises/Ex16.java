package exercises;

import java.math.BigInteger;

public class Ex16 {
    public static String solve() {
        BigInteger a = new BigInteger("2");
        BigInteger sum = new BigInteger("0");
        BigInteger b;
        a = a.pow(1000);
        int dig = getDigitCount(a);

        for (int i = 0; i < dig; i++) {

            b = BigInteger.valueOf(Character.getNumericValue(a.toString().charAt(i)));
            sum = sum.add(b);
        }
        return sum.toString();
    }

    public static int getDigitCount(BigInteger number) {
        double factor = Math.log(2) / Math.log(10);
        int digitCount = (int) (factor * number.bitLength() + 1);
        if (BigInteger.TEN.pow(digitCount - 1).compareTo(number) > 0) {
            return digitCount - 1;
        }
        return digitCount;
    }
}
