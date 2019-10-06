import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int R = sc.nextInt();
            int C = sc.nextInt();
            String s1[] = new String[R];
            for(int i=0;i<R;i++){
                s1[i] = sc.next();
            }
            int r = sc.nextInt();
            int c = sc.nextInt();
            String s2[] = new String[r];
            for(int i=0;i<r;i++){
                s2[i] = sc.next();
            }
            String sub;
            int flag=0;
            for(int i=0;i<=R-r;i++){
                for(int j=0;j<=C-c;j++){
                    sub = s1[i].substring(j,j+c);
                    if(sub.equals(s2[0])){
                        int k=1;
                        while(k<r && s2[k].equals(s1[i+k].substring(j,j+c))){
                            k++;
                        }
                        if(k==r)
                            flag=1;
                    }
                }
            }
            System.out.println((flag==1)?"YES":"NO");
        }
    }
}