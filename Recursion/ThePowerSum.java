import java.util.*;

/**
 * Created by rajat goyal on 3/19/2017.
 */

public class ThePowerSum {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	int n = sc.nextInt();
    	int a = (int)Math.pow(x,(1/n));
      System.out.println(power(x, n, a));
    }

    public static int power(int x, int n, int a) {
    	if(x<0) return 0;
    	if(x==0) return 1;
    	if(x==1) return 1;
    	int sum = 0;
    	for(int i=a;i>=1;i--){
    		int temp = x-i*i;
    		int b = (int)Math.pow(temp, (1/n));
    		sum += power(temp, n, b);
    	}
    	return sum;
    }
}
