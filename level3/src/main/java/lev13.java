import java.util.Scanner;
public class lev13{
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        return new String[]{
                String.format("%.2f", heightCm),
                String.format("%.2f", weight),
                String.format("%.2f", bmi),
                status
        };
    }
    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            result[i] = calculateBMI(data[i][0], data[i][1]);
        }

        return result;
    }
    public static void display(String[][] data) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" +
                    data[i][1] + "\t\t" +
                    data[i][2] + "\t\t" +
                    data[i][3]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][2]; // [weight, height]
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));

            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }
        String[][] result = processBMI(persons);
        display(result);
        sc.close();
    }
}