import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max=0;
        int count;
        int team=0;
        boolean b[] = new boolean[m];
        boolean a[][] = new boolean[n][m];
        for(int i=0;i<n;i++){
            String s = sc.next();
            for(int j=0;j<m;j++){
                a[i][j] = s.charAt(j) == '1';
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                count=0;
                for(int k=0;k<m;k++){
                    b[k] = a[i][k] || a[j][k];
                    if(b[k])
                        count++;
                }
                if(count==max)
                    team++;
                if(count>max){
                    team = 1;
                    max = count;
                }
            }
        }
        System.out.println(max);
        System.out.println(team);
    }
}