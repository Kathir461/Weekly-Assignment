import java.util.Scanner;
import java.util.Random;
public class levl31 {
    static int Sum(int[] heights){
        int  s = 0;
        for(int i = 0;i< heights.length;i++){
            s+=heights[i];
        }
        return s;
    }
    static double mean(int[] heights){
        int s = Sum(heights);
        for(int i =0;i< heights.length;i++){
            return (double) s/heights.length;
        }
        return 0;
    }
    static int shortest(int[] heights){
        int min = heights[0];
        for(int i =0;i< heights.length;i++){
            if(heights[i]<min){
                min = heights[i];
            }
        }
        return min;
    }
    static int tallest(int[] heights){
        int max = heights[0];
        for(int i = 0;i< heights.length;i++){
            if(heights[i]>max){
                max = heights[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int[] heights = new int[11];
        Random rand = new Random();
        System.out.println("Player Heights: ");
        for(int i = 0;i< heights.length;i++){
            heights[i] = rand.nextInt(101)+150;
            System.out.println(heights[i]+"");
        }
        int sum = Sum(heights);
        double me = mean(heights);
        int Short = shortest(heights);
        int tall = tallest(heights);
        System.out.println("Sum of heights: "+sum);
        System.out.println("Mean of heights: "+me);
        System.out.println("The shortest Height: "+Short);
        System.out.println("The tallest height: "+tall);
    }
}
