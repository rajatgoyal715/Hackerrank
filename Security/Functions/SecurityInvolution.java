import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=1;i<=n;i++){
            map.put(i,sc.nextInt());
        }
        String ans="YES";
        for(int i=1;i<=n;i++){
            if(map.get(map.get(i))!=i)
                ans="NO";
        }
        System.out.println(ans);
    }
}