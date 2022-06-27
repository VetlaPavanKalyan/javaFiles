import java.lang.*;
import java.util.Scanner;
import java.util.Vector;

public class week6b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Integer value :" );
        int i = sc.nextInt();
        System.out.println("Enter Double Value : ");
        double d= sc.nextDouble();
        System.out.println("Enter Float Value : ");
        float f = sc.nextFloat();
        System.out.println("Enter Char Value : ");
        char c = sc.next().charAt(0);
        System.out.println("Enter a Boolean Value : ");
        boolean b = sc.nextBoolean();
        Integer I = i;
        Double D = d;
        Float F = f;
        Character C = c;
        Boolean B = b;
        Vector <Object> v = new Vector<Object>();
        v.add(I);
        v.add(D);
        v.add(F);
        v.add(B);
        v.add(C);
        System.out.println(v);
    }
}
