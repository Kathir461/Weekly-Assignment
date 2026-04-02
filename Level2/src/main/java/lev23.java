import java.util.Scanner;
public class lev23 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int persons = inp.nextInt();
        double[] weight = new double[persons];
        double[] height = new double[persons];
        double[] BMI = new double[persons];
        String[] Status = new String[persons];
        for(int i = 0;i<persons;i++){
            System.out.println(("Enter the Details of person"+(i+1)+":"));
            System.out.print("Weight: ");
            weight[i] = inp.nextDouble();
            System.out.println("\nHeight: ");
            height[i] = inp.nextDouble()/100;
        }
        for(int i = 0;i<persons;i++){
            BMI[i] = weight[i]/(height[i]*height[i]);
            if(BMI[i]<=18.4){
                Status[i] = "Underweight";
            }
            else if(BMI[i]>=18.5 || BMI[i]<=24.9){
                Status[i] = "Normal";
            }
            else if(BMI[i]>=25.0 || BMI[i]<=39.9){
                Status[i] = "Overweight";
            }
            else if(BMI[i]>=40.0){
                Status[i] = "Obese";
            }
        }
        for(int i = 0; i<persons;i++){
            System.out.println("Height of person "+(i+1)+":"+height[i]);
            System.out.println("Weight of person "+(i+1)+":"+weight[i]);
            System.out.println("BMI of person "+(i+1)+":"+BMI[i]);
            System.out.println("Weight Status of person "+(i+1)+":"+Status[i]);
        }
    }
}