import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        /*System.out.println("Enter the base of the triangle : ");
        float base = reader.nextFloat();
        System.out.println("Enter the height of the triangle : ");
        float height = reader.nextFloat();
        float area = (base * height) / 2F;
        System.out.println("Area of the given Triangle is = " + area);*/
        float a, b, c, s;
        double area;
        System.out.println("Enter Sides of the triangle :");
        a = reader.nextFloat();
        b = reader.nextFloat();
        c = reader.nextFloat();
        s = (a + b + c) / 2F;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the given triangle is:"+area);
    }
}
