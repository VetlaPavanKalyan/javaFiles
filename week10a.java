import java.util.Scanner;

public class week10a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        String num1 = sc.next();
        String num2 = sc.next();
        try{
            int a=Integer.parseInt(num1);
            int b=Integer.parseInt(num2);
            try{
                int res =a/b;
                System.out.println(res);
            }catch (ArithmeticException ae){
                System.out.println(ae.getMessage());
            }
        }catch (NumberFormatException ne){
            System.out.println(ne.getMessage());
        }
    }
}
