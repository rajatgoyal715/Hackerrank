import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(x.readLine());
        int n;
        int a[][] = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                a[i][j]=x.read();
                if(a[i][j]==10)
                    a[i][j]=x.read();
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==0 || i==size-1 || j==0 || j==size-1)
                    System.out.print((char)a[i][j]);
                else{
                    if(a[i][j] > a[i-1][j] && a[i][j] > a[i+1][j] && a[i][j] > a[i][j-1] && a[i][j] > a[i][j+1])
                        System.out.print("X");
                    else
                        System.out.print((char)a[i][j]);
                }
            }
            System.out.println();
        }
    }
}