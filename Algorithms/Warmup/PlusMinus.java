import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int neg=0;
        int pos=0;
        int zero=0;
        int a;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            a = sc.nextInt();
            if(a>0)
                pos++;
            else if(a<0)
                neg++;
            else
                zero++;
        }
        float fp = (float)pos/n;
        float fn = (float)neg/n;
        float fz = (float)zero/n;
        System.out.printf("%.3f\n",fp);
        System.out.printf("%.3f\n",fn);
        System.out.printf("%.3f\n",fz);
    }
}