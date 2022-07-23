import java.io.*;
import java.nio.charset.StandardCharsets;

public class week9 {
    public static void main(String[] args) throws Exception{
        File myFile=new File("C:/Users/VETLA PAVAN KALYAN/OneDrive/Desktop/try.txt");
        FileInputStream inputStream=new FileInputStream(myFile);
        FileOutputStream outputStream=new FileOutputStream(myFile);
        int i,numCount=0,charCount=0,specialCount=0;
        while((i= inputStream.read())!=-1){
            char x=(char)i;
            if(x>=48 && x<=57){
                numCount++;
            }else if((x>=65&&x<=90)||(x>=97&&x<=122)){
                charCount++;
            }else if((x>=32 && x<=47)||(x>=58&&x<=64)||(x>=91&&x<=96)||(x>=123&&x<=126)){
                specialCount++;
            }
        }
        String s="Number count = "+numCount+"Character count ="+charCount+"Special Characters ="+charCount;
        byte[] a =s.getBytes(StandardCharsets.UTF_8);
        outputStream.write(a);
    }
}
