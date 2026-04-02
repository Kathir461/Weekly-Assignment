import java.util.Scanner;
public class levl11{
    static double calc(double principle, double rate, double time){
        return (principle * rate * time)/100;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        double principle = inp.nextDouble();
        System.out.print("\nEnter the rate of interest: ");
        double rate = inp.nextDouble();
        System.out.print("\nEnter Time: ");
        double time = inp.nextDouble();
        double SI = calc(principle,rate,time);
        System.out.println("The simple interest is "+SI+" for Principal "+principle+" Rate of Interest "+rate+" and Time "+time);
    }
}
