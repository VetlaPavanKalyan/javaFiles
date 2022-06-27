import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercises_1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int a = reader.nextInt();
        /*System.out.println("Enter Second Number:");
        int b = reader.nextInt();
        System.out.println("Enter third number:");
        int c = reader.nextInt();*/
        /*if (a == b) {
            System.out.println("Both are equal!!!");
        } else {
            System.out.println("Not Equal!!!");
        }*/
        /*if (a % 2 == 0) {
            System.out.println("EVEN!!!");
        } else {
            System.out.println("ODD!!!");
        }*/
        /*int smallest = a;
        if (b < smallest) {
            smallest = b;
        } else if (c < smallest) {
            smallest = c;
        }
        System.out.println("smallest number : " + smallest);*/
        if (a >= 18 && a < 100) {
            if (a <= 60) {
                int age = 60 - a;
                System.out.println("You will retire in " + age + " years");
            } else {
                int age = a - 60;
                System.out.println("You have already retired " + age + " years ago");
            }
        } else {
            System.out.println("Enter a Valid Age!!!");
        }
    }
}
