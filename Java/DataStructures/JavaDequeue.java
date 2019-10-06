    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<Integer>();
            int n = in.nextInt();
            int m = in.nextInt();
            int a[]=new int[10000001];
            int max=0,u=0;

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                if(deque.size()<m){
                    deque.addLast(num);
                    if(a[num]++==0)
                        u++;
                }
                else{
                    if(u>max)
                        max=u;
                    if(a[(int)deque.removeFirst()]--==1)
                        u--;
                    deque.addLast(num);
                    if(a[num]++==0)
                        u++;
                }
            }
            if(u>max)
                max=u;
            System.out.println(max);
        }
    }
