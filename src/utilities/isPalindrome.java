package utilities;

public class isPalindrome {

    public static boolean isPal(String str) {
        int len = str.length();
        if (len == 1) return true;

        int i = 0;
        while(i < len / 2) {
            if (str.charAt(i) == str.charAt(len - i - 1)) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPal(long l) {
        return isPal(String.valueOf(l));
    }

}
