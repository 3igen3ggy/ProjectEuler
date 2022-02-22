package exercises;

public class Ex5 {
    public static int solve() {
        int i = 1;
        while (true) {
            //omitted overlapping values
            if (i % 7 == 0 && i % 8 == 0 && i % 9 == 0 && i % 11 == 0 && i % 13 == 0 && i % 15 == 0 && i % 16 == 0 && i % 17 == 0 && i % 18 == 0 && i % 19 == 0 && i % 20 == 0) {
                return i;
            }
            i++;
        }
    }

}
