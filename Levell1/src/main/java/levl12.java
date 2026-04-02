import java.util.Scanner;
public class levl12 {
    static int maximum(int numberofstudents){
       int n = numberofstudents;
       return (n*(n-1))/2;
   }
   public static void main(String[] args){
       Scanner inp = new Scanner(System.in);
       System.out.print("Enter the number of students: ");
       int numberofstudents = inp.nextInt();
       int result = maximum(numberofstudents);
       System.out.println("The number of possible handshakes is "+result);
   }
}
