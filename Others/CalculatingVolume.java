class Calculate{
    public static Scanner scan = new Scanner(System.in);
    Output output = new Output();
    
    public static int getINTVal() throws IOException{
        int n = scan.nextInt();
        if(n<=0)
            throw new NumberFormatException("All the values must be positive");
        return n;
    }
    
    public static double getDoubleVal() throws IOException{
        double n = scan.nextDouble();
        if(n<=0)
            throw new NumberFormatException("All the values must be positive");
        return n;
    }
    
    public static Volume get_Vol(){
        return new Volume();
    }

}

class Volume{
    public static double main(int a){
        return a*a*a;
    }
    public static double main(int l,int b,int h){
        return l*b*h;
    }
    public static double main(double r){
        return (2*Math.PI*r*r*r)/3;
    }
    public static double main(double r,double h){
        return Math.PI*r*r*h;
    }
}

class Output{
    public static void display(double v){
        System.out.println(String.format("%.3f",v));
    }
}
