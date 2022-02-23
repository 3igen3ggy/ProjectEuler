package exercises;

public class Ex24 {
    public static String solve() {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < 999999; i++) {
            nextPerm(arr);
        }

        String ans = "";

        for (int j : arr) {
            ans = ans.concat(String.valueOf(j));
        }
        return ans;
    }

    public static void nextPerm(int[] arr) {
        int i = arr.length - 1;
        int j = arr.length - 1;

        while (i > 0 && arr[i - 1] >= arr[i]) i--;
        if (i <= 0) {
            System.out.println("LAST PERMUTATION");
            System.exit(666);
        }
        int pivot = arr[i - 1];

        while (arr[j] <= arr[i - 1]) j--;
        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        j = arr.length - 1;

        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
