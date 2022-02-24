package exercises;

import java.util.ArrayList;

import static utilities.EratosthenesSieve.Sieve;

public class Ex37 {
    public static int solve() {
        int n = 10000000;
        int sum = 0;
        int counter = 0;
        boolean[] sieve = Sieve(n);
        ArrayList<Integer> primesList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (sieve[i]) primesList.add(i);
        }
        int len = primesList.size();

        for (int i = 4; i < len; i++) {
            int savePrime = primesList.get(i);
            int prime = savePrime;
            int numLen = (int) Math.log10(prime) + 1;
            int firstDig = Integer.parseInt(String.valueOf(String.valueOf(prime).charAt(0)));
            int lastDig = Integer.parseInt(String.valueOf(String.valueOf(prime).charAt(numLen - 1)));

            if (!((firstDig == 2 || firstDig == 3 || firstDig == 5 || firstDig == 7) && (lastDig == 2 || lastDig == 3 || lastDig == 5 || lastDig == 7))) continue;

            int left = cutLeft(prime);
            int right = cutRight(prime);
            numLen = (int) Math.log10(right) + 1;

            if (!sieve[left] || !sieve[right]) continue;

            while (numLen != 1) {
                left = cutLeft(left);
                right = cutRight(right);
                numLen = (int) Math.log10(left) + 1;
                if (!sieve[left] || !sieve[right]) break;
            }

            if (numLen == 1) {
                counter++;
                sum += savePrime;
                System.out.println("Truncable Prime: " + savePrime);
            }
            System.out.println("i: " + i);
        }
        System.out.println("counter: " + counter);
        return sum;
    }

    public static int cutLeft(int n) {
        int len = (int) Math.log10(n) + 1;
        return Integer.parseInt(String.valueOf(n).substring(1, len));
    }

    public static int cutRight(int n) {
        int len = (int) Math.log10(n) + 1;
        return Integer.parseInt(String.valueOf(n).substring(0, len - 1));
    }
}
