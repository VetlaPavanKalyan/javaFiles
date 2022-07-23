import java.util.Scanner;

public class week10b {
    public static void main(String[] args) throws RideException {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if(a<20){
            throw new RideException("Sorry cant Ride");
        }else{
            System.out.println("Enjoy your ride");
        }
    }
    static class RideException extends Exception{
        RideException(String s){
            System.out.println(s);
        }
    }
}
