import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException{
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(scan.readLine());
		for(int i=0;i<T;i++){
			String code = scan.readLine();
			String text[] = scan.readLine().split(" ");
			//int N = 0;
			boolean record[] = new boolean[26];
			String original = "";
			for(int j=0;j<code.length();j++)
				if(!record[code.charAt(j)-65]){
					record[code.charAt(j)-65] = true;
					original+=(code.charAt(j));
				}
			int cols = original.length();
			int rows = 26/cols;
			if(26%cols != 0)
				rows++;
			String matrix[] = new String[rows];
			int index = 0;
			matrix[0] = original;
			int count = cols;
			for(int j=1;j<rows && count<26;j++){
				String temp = "";
				for(int k=0;k<cols && count<26;k++)
					if(record[index]){
						k--;
						index++;
					}
					else{
						record[index] = true;
						temp+=((char)(index+65));
						index++;
						count++;
					}
				matrix[j] = temp;
			}
			String complete = "";
			char sorted[] = original.toCharArray();
			int indices[] = new int[cols];
			for(int j=0;j<cols;j++)
				indices[j] = j;
			for(int j=0;j<cols;j++){
				int min = j;
				for(int k=j+1;k<cols;k++)
					if(sorted[k]<sorted[min])
						min = k;
				char t = sorted[min];
				sorted[min] = sorted[j];
				int te = indices[min];
				indices[min] = indices[j];
				indices[j] = te;
			}
			for(int j=0;j<cols;j++){
				int col = indices[j];
				for(int k=0;k<rows && col<matrix[k].length();k++){
					complete+=(matrix[k].charAt(col));
				}
			}
			char decryption_code[] = new char[26];
			for(int j=0;j<26;j++)
				decryption_code[complete.charAt(j)-65] = (char)(65+j);
			for(int j=0;j<text.length;j++){
				for(int k=0;k<text[j].length();k++){
					System.out.print(decryption_code[text[j].charAt(k)-65]);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}