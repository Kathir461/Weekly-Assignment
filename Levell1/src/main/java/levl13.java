import java.util.Scanner;
public class levl13 {
    static double rounds(double perimeter){
        double dist = 5000;
        return dist/perimeter;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the value of side1: ");
        double s1 = inp.nextInt();
        System.out.print("\nEnter the value of side2: ");
        double s2 = inp.nextInt();
        System.out.print("\nEnter the value of side3: ");
        double s3 = inp.nextInt();
        double perimeter = s1+s2+s3;
        double result = rounds(perimeter);
        System.out.println("The number of rounds needed to complete 5km distance is "+result);
    }
}
