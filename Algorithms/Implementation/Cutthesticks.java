import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        for(i=0;i<n;i++)
            a[i] = sc.nextInt();
        int count;
        do{
        int min = 1000;
        for(i=0;i<n;i++){
            if(a[i]<min && a[i]!=0)
                min = a[i];
        }
        count=0;
        for(i=0;i<n;i++){
            if(a[i]!=0){
                a[i] = a[i] - min;
                count++;
            }
        }
            if(count==0)
                break;
            System.out.println(count);
        }
        while(count!=1);
    }
}