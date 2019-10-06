import java.util.Scanner;

public class Solution {
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int count = 0;
            char[] a = sc.next().toCharArray();
            int l = a.length;
            for(int i=0;i<l/2;i++){
                    if((int)a[i]>(int)a[l-1-i]){
                        count = count + (int)a[i]-(int)a[l-1-i];
                        a[i] = a[l-1-i];
                    }
                    else if((int)a[i]<(int)a[l-1-i]){
                        count = count + (int)a[l-1-i]-(int)a[i];
                        a[l-1-i] = a[i];
                    }
            }
            System.out.println(count);
            n--;
        }
    }
}