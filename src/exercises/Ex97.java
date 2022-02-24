package exercises;

import java.math.BigInteger;

public class Ex97 {
    public static String solve() {
        BigInteger a = new BigInteger("28433");
        BigInteger b = new BigInteger("2");
        int c = 7830457;
        BigInteger d = new BigInteger("1");
        BigInteger tenZeros = new BigInteger("10000000000");
        BigInteger result;

        result = b.pow(c);

        result = result.multiply(a);
        result = result.add(d);

        return result.mod(tenZeros).toString();
    }
}
