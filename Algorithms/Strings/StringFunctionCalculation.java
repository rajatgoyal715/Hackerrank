import java.io.*;
import java.util.*;

public class Solution {

    static int l;
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t=sc.nextLine();
        l=t.length();
        int max=0;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<=l;j++){
                int temp=f(t.substring(i,j),t);
                if(temp>max)
                    max=temp;
            }
        }
        System.out.println(max);
    }
    
    public static int f(String s,String t){
        int l1=s.length();
        int count=0;
        for(int i=0;i<=l-l1;i++){
            if(t.substring(i,i+l1).equals(s))
                count++;
        }
        return count*l1;
    }
}