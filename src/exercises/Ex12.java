package exercises;

public class Ex12 {
    public static int solve() {
        int max = 0;
        long i = 0;
        long imax = 0;
        long trNumMax = 0;
        while(true) {
            long trNum = triangleNum(i);
            int num = divisors(trNum);
            if (num > max) {
                max = num;
                imax = i;
                trNumMax = trNum;


            }
            if (num > 500) {

                System.out.println("i: " + i);
                System.out.println("trNum: " + trNum);
                break;
            }
            System.out.println("i: " + i + ", trNum: " + trNum + ", Divisors num: " + num);
            System.out.println("i: " + imax + ", trNum: " + trNumMax + ", Divisors num: " + max + " <-- MAX");
            System.out.println();
            i++;
        }
        return max;
    }

    public static long triangleNum(long n) {

        long sum = 0L;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int divisors(long n) {

        int num = 1;

        for (int i = 1; i <= n / 2; i++) {

            if (n % i == 0) {

                num++;

            }

        }
        return num;
    }

}
