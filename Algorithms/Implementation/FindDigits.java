import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t!=0){
            int num = s.nextInt();
            int n = num;
            int count=0;
            while(n!=0){
                if(n%10!=0){
                if(num%(n%10)==0)
                    count++;
                }
                n = n/10;
            }
            System.out.println(count);
            t--;
        }
    }
}