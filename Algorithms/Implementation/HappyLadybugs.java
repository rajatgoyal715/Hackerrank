import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            char b[] = in.next().toCharArray();
            char a[] = new char[26];
            int space=0;
            String ans = "NO";
            for(int i=0;i<n;i++){
                if(b[i]=='_')
                    space++;
                else
                    a[b[i]-65]++;
            }
            
            if(space==0&&ordered(n,b))
                ans="YES";
            else if(space>0){
                for(int i=0;i<26;i++){
                    if(a[i]==1)
                        break;
                    if(i==25)
                        ans="YES";
                }
            }
            
            System.out.println(ans);
        }
    }
    
    public static boolean ordered(int n, char b[]) {
        if(n==1&&b[0]!='_')
            return false;
        if(b[0]!=b[1] || b[n-2]!=b[n-1])
            return false;
        for(int i=1;i<n-1;i++) {
            if(b[i]!=b[i-1]&&b[i]!=b[i+1])
                return false;
        }
        return true;
    }
}
