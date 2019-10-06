import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
            int count = (map.get(magazine[magazine_i])!=null) ? map.get(magazine[magazine_i]) : 0;
            map.put(magazine[magazine_i], count + 1);
        }
        boolean possible = true;
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
            if(map.get(ransom[ransom_i])==null || map.get(ransom[ransom_i])==0) {
                possible = false;
                break;
            } else {
                map.put(ransom[ransom_i], map.get(ransom[ransom_i]) - 1);
            }
        }
        System.out.println((possible)?"Yes":"No");
    }
}
