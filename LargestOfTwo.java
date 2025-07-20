import java.util.Scanner;
public class LargestOfTwo {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int NUM1,NUM2,LargeNum;
    System.out.println("Enter the First number:");
    NUM1=sc.nextInt();
    System.out.println("Enter the Second number:");
    NUM2=sc.nextInt();
    LargeNum=NUM1>NUM2?NUM1:NUM2;
    System.out.println(LargeNum+" IS THE LARGEST");
    }
}