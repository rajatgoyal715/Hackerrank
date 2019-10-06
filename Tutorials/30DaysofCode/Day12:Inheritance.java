class Student extends Person{
	private int[] testScores;
   Student(String firstName, String lastName, int identification,int[] scores){
       super(firstName,lastName,identification);
       testScores = new int[scores.length];
       testScores=scores;
   }
    public int average(){
        int sum=0;
        int l=testScores.length;
        for(int i=0;i<l;i++){
            sum+=testScores[i];
        }
        return sum/l;
    }
    public char calculate(){
        int a=average();
        char grade;
        if(a>=90)
            grade='O';
        else if(a>=80)
            grade='E';
        else if(a>=70)
            grade='A';
        else if(a>=55)
            grade='P';
        else if(a>=40)
            grade='D';
        else
            grade='T';
        return grade;
    }
}