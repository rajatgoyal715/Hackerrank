import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static void displayPathtoPrincess(int n, String [] grid){
    int i1,j1;
    int i2=0;
    int j2=0;
    label:
    for(int i=0; i<n;i++){
        for(int j=0;j<n;j++){
            if(grid[i].charAt(j)=='p'){
                i2=i;
                j2=j;
                break label;
            }
        }
    }
    i1=n/2;
    j1=n/2;
    int n1=i2-i1;
    int n2=j2-j1;
    while(n1!=0){
        if(n1>0){
            System.out.println("DOWN");
            n1--;
        }
        else{
            System.out.println("UP");
            n1++;
        }
    }
    while(n2!=0){
        if(n2>0){
            System.out.println("RIGHT");
            n2--;
        }
        else{
            System.out.println("LEFT");
            n2++;
        }
    }
  }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

    displayPathtoPrincess(m,grid);
    }
}
