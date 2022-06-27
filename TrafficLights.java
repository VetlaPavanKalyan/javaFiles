import java.sql.SQLOutput;
import java.util.Scanner;

public class TrafficLights {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter The Traffic Light : ");
        String light = reader.nextLine();
        if (light.equalsIgnoreCase("Red")) {
            System.out.println("Stop!!!");
        } else if (light.equalsIgnoreCase("Orange")) {
            System.out.println("Get Ready!!!");
        } else if (light.equalsIgnoreCase("Green")) {
            System.out.println("GO!!!");
        } else {
            System.out.println("WRONG INPUT!!!");
        }
    }
}
