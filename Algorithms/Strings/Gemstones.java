import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        char word[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<n;i++){
            s[i] = sc.next();
        }
        int c;
        int count=0;
        int flag=1;
        label1:
        for(int j=0;j<26;j++){
            label2:
            c=0;
            for(int i=0;i<n;i++){
                int l = s[i].length();
                label3:
                for(int k=0;k<l;k++){
                    if(word[j]==s[i].charAt(k)){
                        flag=1;
                        break;
                    }
                    flag=0;
                }
                if(flag==0)
                    break;
                else
                    c++;
            }
            if(c==n)
                count++;
        }
        System.out.println(count);
    }
}