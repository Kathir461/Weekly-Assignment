import java.util.Scanner;
public class lev13 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = inp.nextInt();
        int[] table = new int[11];
        for(int i = 0;i<table.length;i++){
            table[i] = number*i;
        }
        System.out.println("\nMultiplication table");
        for(int i = 0;i< table.length;i++){
            System.out.println(number+"*"+i+"="+table[i]);
        }
    }
}
