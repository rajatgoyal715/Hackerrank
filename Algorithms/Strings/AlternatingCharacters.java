import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while((t--)!=0){
            int delete = 0;
            String s = sc.next();
            int l = s.length();
            for(int i=1;i<l;i++){
                if(s.charAt(i)==s.charAt(i-1))
                    delete++;
            }
            System.out.println(delete);
        }
    }
}