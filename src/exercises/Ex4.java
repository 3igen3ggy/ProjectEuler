package exercises;

public class Ex4 {
    public static int solve() {
        int max = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int mult = i * j;
                if (mult > max && utilities.isPalindrome.isPal(mult)) max = mult;
            }
        }
        return max;
    }
}
