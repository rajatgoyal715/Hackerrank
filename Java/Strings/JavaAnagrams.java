import java.io.*;
import java.util.*;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        int s1[] = new int[26];
        int s2[] = new int[26];
        int l1 = a.length();
        int l2 = b.length();
        if (l1 != l2)
            return false;
        int n;
        for (int i = 0; i < l1; i++) {
            n = a.charAt(i) - 65;
            if (n > 25)
                n -= 32;
            s1[n]++;
            n = b.charAt(i) - 65;
            if (n > 25)
                n -= 32;
            s2[n]++;
        }
        for (int i = 0; i < 26; i++) {
            if (s1[i] != s2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}