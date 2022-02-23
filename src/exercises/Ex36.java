package exercises;

public class Ex36 {
    public static int solve() {
        int sum = 0;
        for (int i = 1; i < 1000000; i++) {
            if (isPalindrome(String.valueOf(i))) {
                String binary = Integer.toBinaryString(i);
                if (isPalindrome(binary)) sum += i;
            }
        }
        return sum;
    }

    public static boolean isPalindrome (String a) {
        int len = a.length();
        for (int i = 0; i <= len / 2; i++) {
            if (a.charAt(i) != a.charAt(len - 1 - i)) return false;
        }
        return true;
    }
}
