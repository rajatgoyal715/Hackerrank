import java.util.*;
import java.io.*;

class SansaAndXor{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t1=sc.nextInt();
		while(t1--!=0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			int xor=a[n-1];
			if(n%2==0)
				xor=0;
			else{
				for(int i=0;i<n-1;i++){
					if(i%2==0)
						xor^=a[i];
				}
			}
			System.out.println(xor);
		}
	}
}