package exercises;

import java.util.ArrayList;

public class Ex23 {
    public static int solve() {
        ArrayList<Integer> abundant = new ArrayList<>();

        int limit = 28123;

        for (int i = 0; i <= limit; i++) {
            ArrayList<Integer> divs = new ArrayList<>();

            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    divs.add(j);
                }
            }

            int len = divs.size();
            int sum = 0;

            for (Integer div : divs) {
                sum += div;
            }
            if (sum > i) {
                abundant.add(i);
            }
        }

        boolean[] sums = new boolean[limit + 1];

        for (int i = 0; i < abundant.size(); i++) {
            for (int j = i; j < abundant.size(); j++) {
                int sum = abundant.get(i) + abundant.get(j);

                if (sum >= limit) break;
                sums[sum] = true;
            }
        }

        int summingUp = 0;

        for (int i = 0; i < limit; i++) {
            if (!sums[i]) summingUp += i;
        }
        return summingUp;
    }
}
