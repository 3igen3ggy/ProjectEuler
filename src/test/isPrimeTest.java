package test;


import static utilities.isPrime.primeCheck;

public class isPrimeTest {
    static int countPassed;
    static int countFailed;
    static int totalTests;
    public isPrimeTest() {
        test(0, false);
        test(1, false);
        test(2, true);
        test(11711, false);
        test(15485863, true);
        test(32452842, false);
        test(32452843, true);

        System.out.println("\n" + "Tests passed: " + countPassed + "/" + totalTests + ", tests failed: " + countFailed + "/" +totalTests);
        if (countPassed == totalTests) System.out.println("TEST PASSED!");
        else System.out.println("TEST FAILED");
    }

    public void test(long n, boolean sol) {
        totalTests++;
        int counter = 0;

        if (primeCheck(n) == sol) {
            countPassed++;
            System.out.println("Test " + totalTests + " passed");
        } else {
            countFailed++;
            System.out.println("Test " + totalTests + " NOT passed");
        }
    }

}
