import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            boolean isfunny = true;
            String s = sc.next();
            int l = s.length();
            for(int i=1;i<l;i++){
                if(Math.abs(s.charAt(i)-s.charAt(i-1))!=Math.abs(s.charAt(l-i)-s.charAt(l-i-1)))
                    isfunny = false;
            }
            if(isfunny)
                System.out.println("Funny");
            else
                System.out.println("Not Funny");
        }
    }
}