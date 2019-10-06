import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while((t--)!=0){
            String a = sc.next() + " ";
            String b = sc.next() + " ";
            char s1,s2;
            boolean equals = false;
            int visited[] = new int[26];
            try{
            label:
            for(int i=0;(int)(a.charAt(i))!=32;i++){
                s1 = a.charAt(i);
                if(visited[s1-97]==0){
                    try{
                    for(int j=0;(int)(b.charAt(j))!=32;j++){
                        s2 = b.charAt(j);
                        if(s1==s2){
                            equals = true;
                            break label;
                        }
                    }
                    }
                    catch(Exception e){
                        System.out.println("exception caught 1");
                    }
                    visited[s1-97] = 1;
                }
            }
            }
            catch(Exception e){
                System.out.println("exception caught 2");
            }
            if(equals)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}