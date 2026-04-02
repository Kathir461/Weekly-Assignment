import java.util.Scanner;
public class levl22 {
    static double convertkmtomiles(double km){
        double km2miles = 0.621371;
        return km*km2miles;
    }
    static double convertmilestokm(double miles){
        double miles2km = 1.60934;
        return miles*miles2km;
    }
    static double convertmeterstofeet(double meters){
        double meters2feet = 3.28084;
        return meters*meters2feet;
    }
    static double convertfeettometers(double feet){
        double feet2meters = 0.3048;
        return feet*feet2meters;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("10km to miles: "+convertkmtomiles(10));
        System.out.println("10mils to km: "+convertmilestokm(10));
        System.out.println("10 meters to feet: "+convertmeterstofeet(10));
        System.out.println("10 feet to meters: "+convertfeettometers(10));
    }
}
