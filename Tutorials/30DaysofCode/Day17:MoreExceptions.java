class Calculator {
    int power(int n,int p) throws Exception{
        if(n<0||p<0){
            throw new Exception("n and p should be non-negative");
        }
        return (int)Math.pow(n,p);
    }
}