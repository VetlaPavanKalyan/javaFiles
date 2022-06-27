import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        A r1 = new A();
        A r2 = new A();
        System.out.println("Enter r1 values : ");
        r1.x = reader.nextInt();
        r1.y = reader.nextDouble();
        System.out.println("R1 Values are : " + r1.x + " & " + r1.y);
        r1.display();
        System.out.println("Enter r2 values : ");
        r2.x = reader.nextInt();
        r2.y = reader.nextDouble();
        System.out.println("R2 Values are : " + r2.x + " & " + r2.y);
        r2.display();
    }
}

class A {
    int x;
    double y;

    void display() {
        System.out.println("Product = " + (x * y));
    }
}