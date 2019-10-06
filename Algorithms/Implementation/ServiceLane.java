import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int t = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        while(t!=0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int min = arr[a];
            for(int j = a; j<=b; j++){
                if(arr[j]<min)
                    min = arr[j];
            }
            System.out.println(min);
        }
    }
}