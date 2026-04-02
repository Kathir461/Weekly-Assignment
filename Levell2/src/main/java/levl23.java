import java.util.Scanner;
class levl23{
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        levl23 obj = new levl23();
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            boolean canVote = obj.canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Invalid age entered!");
            } else if (canVote) {
                System.out.println("Student can vote.");
            } else {
                System.out.println("Student cannot vote.");
            }
        }
    }
}