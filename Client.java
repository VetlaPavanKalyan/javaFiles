import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket s=new Socket("localhost",6666);
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        OutputStream os=s.getOutputStream();
        os.write(a);
        os.write(b);
        System.out.println("Numbers sent succesfully");
        InputStream is=s.getInputStream();
        System.out.println(is.read());
    }
}
