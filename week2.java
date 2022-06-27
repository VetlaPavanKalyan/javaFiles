import java.util.Scanner;

public class week2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n = sc.nextInt();
        int[] a = new int[n];
        int c;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + "th term :");
            a[i] = sc.nextInt();
            if (a[i] % 2 != 0) {
                c = 0;
                for (int j = 1; j <= a[i]; j++) {
                    if (a[i] % j == 0) {
                        c++;
                    }
                }
                if (c == 2) {
                    System.out.println(a[i] + " is Both Odd and Prime");
                }
            }
        }
    }
}
