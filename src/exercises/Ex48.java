package exercises;

import java.math.BigInteger;

public class Ex48 {
    public static String solve() {
        BigInteger a;
        BigInteger sum = new BigInteger("0");


        int n = 1000;


        for (int i = 1; i <= n; i++) {

            a = BigInteger.valueOf(i);
            a = a.pow(i);
            sum = sum.add(a);
        }
        String s = sum.toString();
        int len = s.length();

        return s.substring((len - 10), len);
    }
}
