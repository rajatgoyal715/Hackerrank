import java.util.Scanner;

public class Solution {
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int A[] = new int[n];
            if(b==a){
                System.out.print((n-1)*a + "\n");
            }
            else{
            for(int i=0;i<n;i++){
                if(a<b)
                    A[i] = (n-1-i)*a + i*b;
                else if(a>b)
                    A[i] = (n-1-i)*b + i*a;
            }
            for(int i=0;i<n;i++)
                System.out.print(A[i] + " ");
            System.out.println();
            }
            t--;
        }
    }
}