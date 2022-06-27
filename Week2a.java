import java.util.Scanner;

public class Week2a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Size of the Array :");
        int i,n,j,c;
        n = reader.nextInt();
        long[] a=new long[n];
        for(i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+"th element:");
            a[i]= reader.nextLong();
        }
        for(i=0;i<n;i++){
            c=0;
            for(j=2;j<=Math.sqrt(n);j++){
                if(a[i]%j==0){
                    c++;
                }
                if(c==2){
                    if(a[i]%2!=0){
                        System.out.println("Odd and Prime No.s : ");
                    }
                }
            }
        }
    }
}
