import java.util.Scanner;
public class lev14{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double[] height = new double[11];
        System.out.println("Enter heights of 11 football players: ");
        for(int i =0;i<height.length;i++){
            System.out.print("Player "+(i+1)+": ");
            height[i] = inp.nextDouble();
        }
        double sum = 0;
        for(int i =0;i< height.length;i++){
            sum+=height[i];
        }
        double mean = sum/ height.length;
        System.out.println("\nMean height of the football team is: "+mean);
    }
}