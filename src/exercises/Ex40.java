package exercises;

public class Ex40 {
    public static int solve() {
        String aux = "";
        int champer = 1;

        for (int i = 0; i < 200000; i++) {
            aux = aux.concat(String.valueOf(i));
        }

        for (int i = 1; i <= 1000000; i *= 10) {
            champer *= Integer.parseInt(String.valueOf(aux.charAt(i)));
        }
        return champer;
    }
}
