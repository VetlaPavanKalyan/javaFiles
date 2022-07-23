import java.util.ArrayList;
import java.util.Scanner;

public class Week2a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Size of the Array :");
        ArrayList<Integer> x = new ArrayList<>();
        int i, n, j, c;
        n = reader.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = reader.nextInt();
        }
        for (i = 0; i < n; i++) {
            c = 0;
            for (j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                if (a[i] % 2 != 0) {
                    x.add(a[i]);
                }
            }
        }
        if (x.isEmpty()) {
            System.out.println("Not found");
        } else {
            for (int t : x) System.out.println("Odd and Prime No. : " + t);
        }
    }
}
