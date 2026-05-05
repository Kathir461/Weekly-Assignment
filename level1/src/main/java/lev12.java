import java.util.Scanner;
public class lev12 {
    public static String createsubstr(String str, int start, int end){
        String result ="";
        for(int i = start; i<end;i++){
            result+=str.charAt(i);
        }
        return result;
    }
    public static boolean compare(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i)!= s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = inp.next();
        System.out.println("Enter the Start index: ");
        int start = inp.nextInt();
        System.out.println("Enter the End index: ");
        int end = inp.nextInt();
        String sub1 = createsubstr(str,start,end);
        String sub2 = str.substring(start,end);
        boolean result = compare(sub1,sub2);
        System.out.println("Substring created manually: "+sub1);
        System.out.println("Substring created using substring(): "+sub2);
        System.out.println("Are the two strings created equal? "+result);
    }
}