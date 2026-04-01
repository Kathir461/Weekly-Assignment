import java.util.Scanner;
public class lev12 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int[] num = new int[5];
        for(int i = 0; i<num.length;i++){
            System.out.print("Enter the "+(i+1)+"st number:");
            num[i] = inp.nextInt();
        }
        System.out.println("\nChecking the Conditions");
        for(int i =0;i< num.length;i++){
            if(num[i]<0){
                System.out.println(num[i]+" is a negative number");
            }
            else if(num[i]>0){
                if(num[i]%2==0){
                    System.out.println(num[i]+" is a positive even number");
                }
                else if(num[i]%2!=0){
                    System.out.println(num[i]+" is a positive odd number");
                }
            }
            else{
                System.out.println(num[i]+" is zero");
            }
        }
    }
}
