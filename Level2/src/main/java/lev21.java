import java.util.Scanner;
public class lev21{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newsalary = new double[10];
        double totalbonus = 0;
        double totaloldsalary = 0;
        double totalnewsalary = 0;
        for(int i = 0;i<10;i++){
            System.out.println("Enter the details of Employee"+(i+1));
            System.out.print("Salary: ");
            salary[i] = inp.nextDouble();
            years[i] = inp.nextDouble();
            if(salary[i]<=0 || years[i]<=0) {
                System.out.println("Invalid input please enter a valid input");
                i--;
                continue;
            }
        }
        for(int i = 0;i<10;i++){
            if(years[i]>5){
                bonus[i] = salary[i]*0.05;
            }
            else{
                bonus[i] = salary[i]*0.02;
            }
            newsalary[i] = salary[i]+bonus[i];
            totalbonus+=bonus[i];
            totalnewsalary+=newsalary[i];
            totaloldsalary+=salary[i];
        }
        System.out.println("Employee Details");
        for(int i = 0; i<10;i++){
            System.out.println("Employee "+(i+1)+
                    "| old salary: "+salary[i]+
                    "| bonus: "+bonus[i]+
                    "| new salary: "+newsalary[i]);
        }
        System.out.println("Total bonus payout: "+totalbonus);
        System.out.println("Total old salary "+totaloldsalary);
        System.out.println("Total new Salary "+totalnewsalary);
    }
}