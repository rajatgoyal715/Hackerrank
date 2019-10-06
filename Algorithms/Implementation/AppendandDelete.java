import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char s[] = in.next().toCharArray();
        int s1 = s.length;
        char t[] = in.next().toCharArray();
        int t1 = t.length;
        int k = in.nextInt();
        int contM = 0;
        for(int i=0;i<Math.min(s1,t1);i++) {
            if(s[i]==t[i]){
                contM++;
            } else{
                break;
            }
        }
        String ans = "No";
        int op1 = s1-contM;
        int op2 = t1-contM;
        if(k==(op1+op2))
            ans = "Yes";
        else if(k<(op1+op2))
            ans = "No";
        else if(((k-(op1+op2))/2 < contM) && (((k-(op1+op2))%2)==0))
            ans = "Yes";
        else if(k>(s1+t1))
            ans = "Yes";
            
        System.out.println(ans);
    }
}
