import java.util.Scanner;
public class lev11{
    public static boolean stringcompare(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i = 0; i< s1.length(); i++){
            if(s1.charAt(i)!= s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        {
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter the first string: ");
            String s1 = inp.next();
            System.out.println("Enter the second string: ");
            String s2 = inp.next();
            boolean result1 = stringcompare(s1,s2);
            boolean result2 = s1.equals(s2);
            System.out.println("Result using charAt(): "+result1);
            System.out.println("Result using equals(): "+result2);
            if(result1 == result2){
                System.out.println("Both the methods give the same result");
            }
            else{
                System.out.println("Results are different");
            }
        }

    }
}
