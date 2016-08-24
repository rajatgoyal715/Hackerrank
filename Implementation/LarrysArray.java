package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LarrysArray {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t--!=0){
            int n=Integer.parseInt(br.readLine());
            String s[]=br.readLine().split(" ");
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=Integer.parseInt(s[i]);
            int prev;
            boolean flag1=false;
            int count,temp;
            label:
            for(int j=0;j<n;j++){
                count=0;
                prev=a[0];
                for(int i=1;i<n;i++){
                    if(a[i]<prev){
                        if(i+1<n){
                            if(a[i+1]<a[i]){
                                // 3 2 1 -> 1 3 2
                                temp=a[i+1];
                                a[i+1]=a[i];
                                a[i]=a[i-1];
                                a[i-1]=temp;
                            }
                            else if(a[i+1]<prev){
                                //3 1 2 -> 1 2 3
                                temp=a[i-1];
                                a[i-1]=a[i];
                                a[i]=a[i+1];
                                a[i+1]=temp;
                            }
                            else{
                                //2 1 3 -> 1 3 2
                                temp=a[i-1];
                                a[i-1]=a[i];
                                a[i]=a[i+1];
                                a[i+1]=temp;
                            }
                        }
                        else{
                            if(a[i-2]>a[i]){
                                //2 3 1 -> 1 2 3
                                temp=a[i];
                                a[i]=a[i-1];
                                a[i-1]=a[i-2];
                                a[i-2]=temp;
                            }
                        }
                    }
                    else{
                        count+=1;
                    }
                    prev=a[i];
                }
                if(count==n-1){
                    flag1=true;
                    break;
                }
            }
            System.out.println((flag1)?"YES":"NO");
        }
    }
}
