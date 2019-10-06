import java.util.Scanner;

public class Solution {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        
        for(int i=0;i<h;i++){
            for(int j=0;j<h-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}