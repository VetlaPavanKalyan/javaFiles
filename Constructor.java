import java.util.Scanner;

class Box {
    double width, breadth, depth;

    Box(double width, double breadth, double depth) {
        this.breadth = breadth;
        this.depth = depth;
        this.width = width;
    }

    double sample() {
        return width * breadth * depth;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Width :");
        double width = reader.nextDouble();
        System.out.println("Enter Breadth :");
        double breadth = reader.nextDouble();
        System.out.println("Enter Depth :");
        double depth = reader.nextDouble();
        Box e1 = new Box(width, breadth, depth);
        double y = e1.sample();
        System.out.println("Volume = " + y);
    }
}