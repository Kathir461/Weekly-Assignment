import java.util.Scanner;
public class lev14 {
    public static String uppermanual(String str){
        String result ="";
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                ch =(char)(ch-32);
            }
            result += ch;
        }
        return result;
    }
    public static boolean compare(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = inp.next();
        String sub1 = uppermanual(str);
        String sub2 = str.toUpperCase();
        boolean result = compare(sub1,sub2);
        System.out.println("String converted to uppercase manually: "+sub1);
        System.out.println("String converted to uppercase by toUpperCase(): "+sub2);
        System.out.println("are the two results the same? "+result);
    }
}