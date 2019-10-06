class Add{
    public static void add(int ... num){
        int l = num.length;
        int sum=num[0];
        String s=num[0]+"";
        for(int i=1;i<l;i++){
            s=s+"+"+num[i];
            sum+=num[i];
        }
        System.out.println(s+"="+sum);
    }
}
