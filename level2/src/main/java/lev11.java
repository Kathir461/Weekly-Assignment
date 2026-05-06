import java.util.Scanner;
public class lev11{
    public static int findlen(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }
        catch(Exception e){
        }
        return count;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = inp.next();
        int result1 = findlen(str);
        int result2 = str.length();
        System.out.println("The length of the string by manual method: "+result1);
        System.out.println("The length of the string by built in function: "+result2);
    }
}
