static Scanner sc = new Scanner(System.in);
static int H = sc.nextInt();
static int B = sc.nextInt();
static boolean flag = (H>0 && B>0);
static{
if(!flag){
    System.out.print("java.lang.Exception: Breadth and height must be positive");
}
}
