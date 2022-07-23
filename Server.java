import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss =new ServerSocket(6666);
        Socket s =ss.accept();
        int sum;
        InputStream is=s.getInputStream();
        int x=is.read();
        int y=is.read();
        sum=x+y;
        System.out.println(sum);
        OutputStream os=s.getOutputStream();
        os.write(sum);
        System.out.println("Sum sent succesfully");
    }
}
