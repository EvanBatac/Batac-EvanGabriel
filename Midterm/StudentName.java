import java.util.Scanner;
public class StudentName{
   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter your first name: ");
      String fname = scan.nextLine();
      System.out.print("Enter your middle name: ");
      String Mname = scan.nextLine();
      System.out.print("Enter your last name: ");
      String lname = scan.nextLine();
      System.out.print("Enter your suffix: ");
      String suffix = scan.nextLine();
      
      Student s = new Student(fname, Mname, lname, suffix);
      System.out.println("First Name: "+ fname);
      System.out.println("Middle Name: "+ Mname);
      System.out.println("Last Name: "+ lname);
      System.out.println("Suffix: "+ suffix);
      
      System.out.println("Full Name: " + fname + " " + Mname + " " + lname + " " + suffix);
   }
}
class Student{
   private String first_name, middle_name, last_name, suffix;

   Student(String first_name, String middle_name, String last_name, String suffix){
      this.first_name = first_name;
      this.middle_name = middle_name;
      this.last_name = last_name;
      this.suffix = suffix; 
   }
   public String getfirst_name(){
      return first_name;
   }
   public String getmiddle_name(){
      return middle_name;
   }
   public String getlast_name(){
      return last_name;
   }
   public String getsuffix(){
      return suffix;
   }
   public void setfirst_name(String first_name){
      this.first_name = first_name;
   }
   public void setmiddle_name(String middle_name){
      this.middle_name = middle_name;
   }
   public void setlast_name(String last_name){
      this.last_name = last_name;
   }
   public void setsuffix(String suffix){
      this.suffix = suffix;
   }
   
}
