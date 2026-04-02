import java.util.Scanner;
public class levl21 {
    static boolean isleapyear(int year){
        if(year<1582){
            return false;
        }
        return (year % 4 ==0 && year % 100!=0)||(year % 400 == 0);
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = inp.nextInt();
        if(year<1582){
            System.out.println("Invalid year");
        }
        else if(isleapyear(year)){
            System.out.println("Year "+year+" is a leap year");
        }
        else{
            System.out.println("Year "+year+" is not a leap year");
        }
    }
}
