import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int count=0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            while(n!=0){
                if(sc.nextInt()<=0)
                    count++;
                n--;
            }
            if(count>=k)
                System.out.println("NO");
            else
                System.out.println("YES");
            t--;
        }
    }
}