import java.util.*;

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

//Complete the code
public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         testCases--;
      }
       
         Collections.sort(studentList, new Comparator<Student>() {
             public int compare(Student s1, Student s2){
                 double c1=s1.getCgpa();
                 double c2=s2.getCgpa();
                 if(c1!=c2){
                     return (c1>c2)?-1:1;
                 }
                 String n1=s1.getFname();
                 String n2=s2.getFname();
                 if(n1.compareTo(n2)!=0)
                     return n1.compareTo(n2);
                 int i1=s1.getId();
                 int i2=s2.getId();
                 return i1-i2;
             }
         });
      
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
