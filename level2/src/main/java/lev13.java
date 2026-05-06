import java.util.Scanner;
public class lev13 {
    public static String checkchar(char ch){
        if(ch>='A' && ch<='Z'){
            ch = (char)(ch+32);
        }
        if(ch>='a'&&ch<='z'){
            if(ch == 'a'||ch == 'e' ||ch =='i'||ch == 'o'|| ch =='u'){
                return "Vowel";
            }
            else{
                return "Consonants";
            }
        }
        else{
            return "Not a Letter";
        }
    }
    public static int[] vccount(String str){
        int vowels = 0;
        int Consonants = 0;
        for(int i = 0; i<str.length();i++){
            String result = checkchar(str.charAt(i));
            if(result.equals("Vowel")){
                vowels++;
            }
            else if(result.equals("Consonants")){
                Consonants++;
            }
        }
        return new int[]{vowels,Consonants};
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = inp.next();
        int[] result = vccount(str);
        System.out.println("Number of vowel count: "+result[0]);
        System.out.println("Number of Consonants count: "+result[1]);
    }
}
