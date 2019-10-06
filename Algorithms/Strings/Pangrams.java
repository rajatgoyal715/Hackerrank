import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s = s1.toLowerCase();
        int flag=0;
        int l = s.length();
        char word[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<26;i++){
            flag=0;
            for(int j=0;j<l;j++){
                if(s.charAt(j)==word[i]){
                    flag = 1;
                    break;
                }
            }
            if(flag==0)
                break;
        }
        if(flag==1)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
            
    }
}