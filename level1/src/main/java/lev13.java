import java.util.Scanner;
public class lev13 {
    public static String returnstr(String str){
        String result = "";
        for(int i = 0;i<str.length();i++){
            result+=str.charAt(i);
        }
        return result;
    }
    public static boolean compare(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i =0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = inp.next();
        String result1 = returnstr(str);
        char[] arr = str.toCharArray();
        String result2 = new String(arr);
        boolean result = compare(result1,result2);
        System.out.println("Characters returned manually: "+result1);
        System.out.println("Characters returned using toCharArray(): "+result2);
        System.out.println("Does both the method return the same result? "+ result);
    }

}