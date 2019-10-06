import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t--!=0){
            int count = 0;
            String s = br.readLine();
            int n = s.length();
            String s1,s2;
            for(int i=1;i<=n;i++){
                for(int j=0;j+i<=n;j++){
                    s1=s.substring(j,j+i);
                    for(int k=j+1;k+i<=n;k++){
                        s2=s.substring(k,k+i);
                        if(anagram(s1,s2))
                            count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        char[] c1 = s1.toCharArray();
        for(char c : c1){
            int index = s2.indexOf(c);
            if(index!=-1){
                s2 = s2.substring(0,index)+s2.substring(index+1,s2.length());
            }
            else{
                return false;
            }
        }
        return s2.isEmpty();
    }
}