package Implementation;

import java.util.Scanner;

/*
 * @author -- rajatgoyal715
 */

public class SaveThePrisoner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int s=sc.nextInt()-1;
            while(m-->0){
                s++;
                if(s>n)
                    s=s%n;
            }
            System.out.println(s);
        }
    }
}
