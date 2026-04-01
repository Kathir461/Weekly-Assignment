import java.util.Scanner;
public class lev11 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int[] std_age = new int[10];
        for(int i = 0;i<std_age.length;i++){
            System.out.print("Enter the age of student"+(i+1)+":");
            std_age[i] = inp.nextInt();
        }
        System.out.println("\nChecking the eligibility");
        for(int i =0; i<std_age.length;i++){
            if(std_age[i]<0){
                System.out.println("Invalid Input");
            }
            else if(std_age[i]>=18){
                System.out.println("The Student with the age "+std_age[i]+" can vote");
            }
            else{
                System.out.println("The Student with the age "+std_age[i]+" cannot vote");
            }
        }
    }
}
