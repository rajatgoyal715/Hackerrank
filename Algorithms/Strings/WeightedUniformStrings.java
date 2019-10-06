import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char c[] = s.toCharArray();
        int l = c.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        char prev = c[0], curr = c[0], subs=1;
        map.put(curr-96, 1);
        for(int i=1;i<l;i++) {
            curr = c[i];
            if(curr==prev){
                subs++;
                map.put(subs*(curr-96), 1);
            } else {
                subs = 1;
                map.put(curr-96, 1);
            }
            prev = curr;
        }
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            System.out.println((map.containsKey(x) ? (map.get(x)==1) : false) ? "Yes" : "No");
        }
    }
}
