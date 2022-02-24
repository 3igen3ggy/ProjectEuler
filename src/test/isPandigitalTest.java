package test;

import static utilities.isPandigital.isPandigit;
import static utilities.isPandigital.isPandigitWithZero;

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

        testWithZero(0, true);
        testWithZero(10, true);
        testWithZero(120, true);
        testWithZero(123, false);
        testWithZero(654321, false);
        testWithZero(76054321, true);
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

    public static void testWithZero(int n, boolean pandigit) {
        totalTests++;

        if (isPandigitWithZero(n) == pandigit) {
            countPassed++;
            System.out.println("Test " + totalTests + " passed");
        } else {
            countFailed++;
            System.out.println("Test " + totalTests + " NOT passed");
        }
    }
}
