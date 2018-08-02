import java.io.*;
import java.util.*;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        int n = s.length() - k;
        String[] arr = new String[n + 1];
        for (int i = 0; i <= s.length() - k; i++) {
            arr[i] = s.substring(i, i + k);
        }
        Arrays.sort(arr);
        return arr[0] + "\n" + arr[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        sc.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}