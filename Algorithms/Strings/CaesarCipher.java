import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String s = in.next();
        int k;
        int num = in.nextInt();
        char a[] = new char[size];
        for(int i=0;i<size;i++){
            a[i] = s.charAt(i);
            if(a[i]>=65 && a[i]<=90){
                k = a[i] + num;
                while(k>90 || k<65)
                    k-=26;
                System.out.print((char)k);
            }
            else if(a[i]>=97 && a[i]<=122){
                k = (int)a[i] + num;
                while(k>122 || k<97)
                    k-=26;
                System.out.print((char)k);
            }
            else
                System.out.print(a[i]);
        }
    }
}