import java.util.Scanner;
public class lev22 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String[] names = {"Amar","Akbar","Anthony"};
        int[] age = new int[3];
        int[] height = new int[3];
        for(int i = 0;i<3;i++){
            System.out.print("Enter the age of "+names[i]+":");
            age[i] = inp.nextInt();
            System.out.print("Enter the height of "+names[i]+":");
            height[i] = inp.nextInt();
        }
        int youngest = 0;
        int tallest = 0;
        for(int i =0;i<3;i++){
            if(age[i]<youngest){
                youngest =i;
            }
            if(height[i]>tallest){
                tallest =i;
            }
        }
        System.out.println("youngest friend: "+names[youngest]+" (Age: "+age[youngest]+")");
        System.out.println("Tallest friend: "+names[tallest]+" (height: "+height[tallest]+")");
    }
}