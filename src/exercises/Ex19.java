package exercises;

public class Ex19 {
    public static int solve() {
        //1 Jan 1901 to 31 Dec 2000
        int sundays = 0;

        for (int i = 1901; i <= 2000; i++) {
            for (int j = 1; j <= 12; j++) {
                if(isSunday(1,j,i)) {
                    sundays++;
                }
            }
        }
        return sundays;
    }
    public static boolean isSunday(int d, int m, int y) {
        double mo;
        int ye;
        int dow;

        mo = (m + 10) % 12;
        if (m <= 2) {
            y--;
        }
        ye = 5 * (y % 4) + 4 * (y % 100) + 6 * (y % 400);
        dow = (d + (int)(2.6 * mo - 0.2) + ye) % 7;

        return dow == 0;
    }
}
