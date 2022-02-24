package exercises;

public class Ex45 {
    public static long solve() {
        for (long i = 285L; i < 10000000000L; i++) {
            long hex = i * (2 * i - 1);
            if (isTriangle(hex) && isPentagonal(hex)) {
                return hex;
            }
        }
        return -1;
    }

    public static boolean isWhole(double i) {
        return (int) i == i;
    }

    //looking only for positive natural number, else: -1
    public static double solveQuadratic(double a, double b, double c) {
        double del = b * b - 4 * a * c;
        double x1 = (-b - Math.sqrt(del)) / ((double) 2 * a);
        double x2 = (-b + Math.sqrt(del)) / ((double) 2 * a);

        if (x1 > 0 && isWhole((x1))) return x1;
        else if (x2 > 0 && isWhole((x2))) return x2;
        return -1;
    }

    public static boolean isTriangle(long a) {
        double sol = solveQuadratic(0.5, 0.5, -a);
        return isWhole(sol) && sol != -1;
    }

    public static boolean isPentagonal(long a) {
        double sol = solveQuadratic(1.5, -0.5, -a);
        return isWhole(sol) && sol != -1;
    }

    public static boolean isHexagonal(long a) {
        double sol = solveQuadratic(2, -1, -a);
        return isWhole(sol) && sol != -1;
    }
}
