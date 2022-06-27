import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int length, breadth, height;
        length = reader.nextInt();
        breadth = reader.nextInt();
        height = reader.nextInt();
        int total_area = 2 * ((length * breadth) + (breadth * height) + (height * length));
        int Volume = (length * breadth * height);
        System.out.println("Total Area = " + total_area + " " + "Volume = " + Volume);
    }
}
