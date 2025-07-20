import java.util.Scanner;
public class StudentDetail{
    public static void main(String args[]){
        float AttendenceScore;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=sc.nextLine();
          System.out.println("Age:");
        int age=sc.nextInt();
          System.out.println("Mobile Number:");
        long mobileNumber=sc.nextLong();
          System.out.println("CGPA:");
        double cgpa=sc.nextDouble();
          System.out.println("Attendence percentage:");
        float Attendence=sc.nextFloat();
        
        if(Attendence>=90){
          AttendenceScore=10;
        }
        else{
      AttendenceScore=Attendence/10;
        }
      System.out.println(" ");
      System.out.println("   My Details  ");
      System.out.println("...................");
      System.out.println("Full Name:        "+name);
      System.out.println("Age:              "+age);
      System.out.println("Mobile Number:    "+mobileNumber);
      System.out.println("CGPA:             "+cgpa);
      System.out.println("Attendence Mark:  "+AttendenceScore);
    }
}