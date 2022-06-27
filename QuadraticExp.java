import java.util.Scanner;

public class QuadraticExp {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double r1, r2;
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        int d = (b * b) - (4 * a * c);
        if (d == 0) {
            r1 = r2 = (double) (-b) / (2 * a);
            System.out.println("Roots are Real and Equal and they are :" + r1 + " " + r2);
        } else if (d > 0) {
            r1 = (double) (-b + (Math.sqrt(d))) / (2 * a);
            r2 = (double) (-b - (Math.sqrt(d))) / (2 * a);
            System.out.println("Roots are Real and Distinct and they are :" + r1 + " " + r2);
        } else {
            r1 = (double) (-b + (Math.sqrt(d))) / (2 * a);
            r2 = (double) (-b - (Math.sqrt(d))) / (2 * a);
            System.out.println("Roots are Imaginary!!!, and they are :" + r1 + " " + r2);
        }
    }
}
