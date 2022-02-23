package exercises;

import java.util.ArrayList;

public class Ex32 {
    public static int solve() {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i <= 9999; i++) {
            for (int j = i; j <= 9999; j++) {
                int res = i * j;
                int iLen = (int) Math.log10(i) + 1;
                int jLen = (int) Math.log10(j) + 1;
                int resLen = (int) Math.log10(res) + 1;

                if (iLen + jLen + resLen > 9) break;
                if (isPandigitalMult(i, j, res) && !list.contains(res)) {
                    list.add(res);
                    sum += res;
                }
            }
        }
        return sum;
    }

    public static boolean isPandigitalMult(int mult, int mult2, int res) {
        int lenRes = (int) Math.log10(res) + 1;
        int lenMult = (int) Math.log10(mult) + 1;
        int lenMult2 = (int) Math.log10(mult2) + 1;

        boolean[] digits = new boolean[10];
        digits[0] = true;

        for (int i = 0; i < lenRes; i++) {
            String aux = String.valueOf(res);
            int temp = Integer.parseInt(String.valueOf(aux.charAt(i)));
            try {
                digits[temp] = true;
            } catch (IndexOutOfBoundsException e) {
                return false;
            }
        }

        for (int i = 0; i < lenMult; i++) {
            String aux = String.valueOf(mult);
            int temp = Integer.parseInt(String.valueOf(aux.charAt(i)));
            try {
                digits[temp] = true;
            } catch (IndexOutOfBoundsException e) {
                return false;
            }
        }

        for (int i = 0; i < lenMult2; i++) {
            String aux = String.valueOf(mult2);
            int temp = Integer.parseInt(String.valueOf(aux.charAt(i)));
            try {
                digits[temp] = true;
            } catch (IndexOutOfBoundsException e) {
                return false;
            }
        }

        for (int i = 1; i < 10; i++) {
            if (!digits[i]) return false;
        }
        return true;
    }
}
