package test;

import utilities.EratosthenesSieve;

public class EratosthenesSieveTest {
    static int countPassed;
    static int countFailed;
    static int totalTests;

    public EratosthenesSieveTest() {
        //solutions taken from wolframalpha.com
        EratosthenesSieveTestCount(0, 0);
        EratosthenesSieveTestCount(1, 0);
        EratosthenesSieveTestCount(100, 25);
        EratosthenesSieveTestCount(10000, 1229);
        EratosthenesSieveTestCount(1000000, 78498);

        System.out.println("\n" + "Tests passed: " + countPassed + "/" + totalTests + ", tests failed: " + countFailed + "/" +totalTests);
        if (countPassed == totalTests) System.out.println("TEST PASSED!");
        else System.out.println("TEST FAILED");
    }
    public void EratosthenesSieveTestCount(int n, int sol) {
        totalTests++;
        int counter = 0;

        EratosthenesSieve es = new EratosthenesSieve();
        boolean[] isPrime = es.Sieve(n);
        for (int i = 0; i < n; i++) {
            if (isPrime[i]) counter++;
        }

        if (counter == sol) {
            countPassed++;
            System.out.println("Test " + totalTests + " passed");
        } else {
            countFailed++;
            System.out.println("Test " + totalTests + " NOT passed");
        }

    }
}
