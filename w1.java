import java.util.*;

public class w1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Temperature in Degree Celsius:");
        double cel = reader.nextDouble();
        double far = (cel * 9.0 / 5.0) + 32;
        System.out.println("Temperature in Farenheit : " + far);
    }
}