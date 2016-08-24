/*
 *  Add any license header using tools << templates << licenses << default license
 */

package Implementation;

/**
 * @author mukul goyal
 */
import java.util.Scanner;

public class JumpingOnClouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int i=0,j=0;
        while(i<n-1){
            if(i+2<n&&c[i+2]==0)
                i+=2;
            else
                i++;
            j++;
        }
        System.out.println(j);
    }
}
