import java.util.*;
import java.io.*;

class AChessboardGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(((((x-1)/2)%2 != 0) || (((y-1)/2)%2 != 0)) ? "First" : "Second");
		}
	}
}