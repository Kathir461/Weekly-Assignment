import java.util.Scanner;
public class lev14 {
    static int check(int num){
        if(num<0){
            return -1;
        }
        else if(num>0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = inp.nextInt();
        int result = check(num);
        System.out.println("\nresult: "+result);
    }
}
