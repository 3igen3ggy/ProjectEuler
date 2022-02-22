package test;

import static utilities.isPalindrome.isPal;
import static utilities.isPrime.primeCheck;

public class isPalindromeTest {
    static int countPassed;
    static int countFailed;
    static int totalTests;
    public  isPalindromeTest() {
        test("a", true);
        test("ab", false);
        test("abba", true);
        test("12345678987654321", true);
        test("123456789987654321", true);
        test(1234554321L, true);
        test(1234567654321L, true);
    }

    public static void test(Object str, boolean pal) {
        totalTests++;

        if (isPal(str.toString()) == pal) {
            countPassed++;
            System.out.println("Test " + totalTests + " passed");
        } else {
            countFailed++;
            System.out.println("Test " + totalTests + " NOT passed");
        }
    }
}
