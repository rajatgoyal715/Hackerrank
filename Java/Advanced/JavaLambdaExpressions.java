    public performOperation checkEvenOdd(){
        return (a) -> ((a%2==0)?0:1);
    }

    public performOperation checkPrime(){
        performOperation p= new performOperation(){
            public int check(int a){
                if(a<=1)
                    return 1;
                if(a==2||a==3)
                    return 0;
                if(a%2==0)
                    return 1;
                for(int i=3;i<=a/2;i+=2){
                    if(a%i==0)
                        return 1;
                }
                return 0;
            }
        };
        return p;
    }

    public performOperation checkPalindrome(){
        performOperation p= new performOperation(){
            public int check(int a){
                int r=0;
                int temp=a;
                while(a!=0){
                    r=r*10+a%10;
                    a/=10;
                }
                //System.out.println(a+" "+r+" "+temp);
                if(r==temp)
                    return 0;
                else
                    return 1;
            }
        };
        return p;
    }
}