package exercises;

import java.math.BigInteger;
import java.util.ArrayList;

public class Ex29 {
    public static int solve() {
        int max = 100;

        ArrayList<BigInteger> list = new ArrayList<>();

        for (int i = 2; i <= max; i++) {
            for (int j = 2; j <= max; j++) {
                BigInteger a = new BigInteger(String.valueOf(i));
                a = a.pow(j);
                if (!list.contains(a)) list.add(a);
            }
        }
        return list.size();
    }
}
