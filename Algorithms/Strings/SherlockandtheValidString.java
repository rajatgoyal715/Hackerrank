import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s[] = sc.nextLine().toCharArray();
        int c[] = new int[26];
        for(char i : s){
            c[i-97]++;
        }
        int temp = c[0];
        int great = 0;
        int small = 0;
        int greater = 0;
        int smaller = 0;
        int diffg=0;
        int diffs=0;
        int check=0;
        int diff1 = Math.abs(c[1]-c[0]);
        int diff2 = diff1;
        for(int i=0;i<26;i++){
            if(c[i]!=0){
                if(c[i]>temp){
                    great++;
                    greater = greater + c[i];
                    diffg = c[i]-temp;
                    if(diffg>diff1){
                        diff1 = diffg;
                    }
                }
                if(c[i]<temp){
                    small++;
                    check = c[i];
                    smaller = smaller + c[i];
                    diffs = temp - c[i];
                    if(diffs>diff2){
                        diff2 = diffs;
                    }
                }
            }
        }
        int valid=0;
        if(small==1&&check==1)
            valid=1;
        else if(diff1>1||diff2>1)
            valid=0;
        else if(great==1&&diffg==1)
            valid=1;
        else if(small==1&&diffs==1)
            valid=1;
        else if((greater==s.length-c[0]&&diff1==1)||(smaller==s.length-c[0]&&diff2==1))
            valid=1;
        else if(small==0&&great==0)
            valid = 1;
        else
            valid=0;
        if(valid==1)
            System.out.println("YES");
        else
            System.out.println("NO");          
    }
}