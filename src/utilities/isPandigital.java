package utilities;

public class isPandigital {
    public static boolean isPandigit(int n) {
        int len = (int) Math.log10(n) + 1;
        boolean[] digits = new boolean[len + 1];

        for (int i = 0; i < len; i++) {
            int digit = Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
            if (digit == 0) return false;
            try {
                if (digits[digit]) return false;
                digits[digit] = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                return false;
            }
        }
        for (int i = 1; i < len; i++) {
            if (!digits[i]) return false;
        }
        return true;
    }
}
