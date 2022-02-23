package test;

import static utilities.isPandigital.isPandigit;

public class isPandigitalTest {
    static int countPassed;
    static int countFailed;
    static int totalTests;

    public isPandigitalTest() {
        test(1, true);
        test(12, true);
        test(120, false);
        test(123, true);
        test(124, false);
        test(1223, false);
        test(123456789, true);
    }

    public static void test(int n, boolean pandigit) {
        totalTests++;

        if (isPandigit(n) == pandigit) {
            countPassed++;
            System.out.println("Test " + totalTests + " passed");
        } else {
            countFailed++;
            System.out.println("Test " + totalTests + " NOT passed");
        }
    }
}
