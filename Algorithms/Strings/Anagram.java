import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char word[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int c;
        int n = sc.nextInt();
        while(n--!=0){
        c=0;
        int count1[] = new int[26];
        int count2[] = new int[26];
        String s = sc.next();
        int l = s.length();
        if(l%2!=0)
            System.out.println(-1);
        else{
        String s1 = s.substring(0,l/2);
        String s2 = s.substring(l/2,l);
        for(int j=0;j<26;j++){
            for(int i=0;i<s1.length();i++){
                if(word[j]==s1.charAt(i))
                    count1[j]++;
            }
        }
        for(int j=0;j<26;j++){
            for(int i=0;i<s2.length();i++){
                if(word[j]==s2.charAt(i))
                    count2[j]++;
            }
        }
        for(int i=0;i<26;i++){
            c = c + (int)Math.abs(count1[i]-count2[i]);
        }
        System.out.println(c/2);
        }
        }
    }
}