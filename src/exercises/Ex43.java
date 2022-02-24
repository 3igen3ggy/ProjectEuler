package exercises;

import java.math.BigInteger;
import java.util.ArrayList;

public class Ex43 {
    public static long solve() {
        String num = "1234567890";
        ArrayList<String> perms = permutation(num);
        long sum = 0L;

        for (String s : perms) {
            if (s.charAt(0) == '0') continue;
            if (Integer.parseInt(s.substring(1, 4)) % 2 == 0) {
                if (Integer.parseInt(s.substring(2, 5)) % 3 == 0) {
                    if (Integer.parseInt(s.substring(3, 6)) % 5 == 0) {
                        if (Integer.parseInt(s.substring(4, 7)) % 7 == 0) {
                            if (Integer.parseInt(s.substring(5, 8)) % 11 == 0) {
                                if (Integer.parseInt(s.substring(6, 9)) % 13 == 0) {
                                    if (Integer.parseInt(s.substring(7, 10)) % 17 == 0) {
                                        sum += Long.parseLong(s);
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        return sum;
    }

    //below is taken from https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string
    public static ArrayList<String> permutation(String s) {
        // The result
        ArrayList<String> res = new ArrayList<>();
        // If input string's length is 1, return {s}
        if (s.length() == 1) {
            res.add(s);
        } else if (s.length() > 1) {
            int lastIndex = s.length() - 1;
            // Find out the last character
            String last = s.substring(lastIndex);
            // Rest of the string
            String rest = s.substring(0, lastIndex);
            // Perform permutation on the rest string and
            // merge with the last character
            res = merge(permutation(rest), last);
        }
        return res;
    }

    public static ArrayList<String> merge(ArrayList<String> list, String c) {
        ArrayList<String> res = new ArrayList<>();
        // Loop through all the string in the list
        for (String s : list) {
            // For each string, insert the last character to all possible positions
            // and add them to the new list
            for (int i = 0; i <= s.length(); ++i) {
                String ps = new StringBuffer(s).insert(i, c).toString();
                res.add(ps);
            }
        }
        return res;
    }
}
