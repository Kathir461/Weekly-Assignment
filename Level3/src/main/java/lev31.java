import java.util.Scanner;
public class lev31 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = inp.nextInt();
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        if (number == 0) {
            count = 1;
        }
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        int[] freq = new int[10];
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }
    }
}