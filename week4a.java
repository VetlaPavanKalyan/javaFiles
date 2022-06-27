import java.util.Locale;
import java.util.Scanner;

public class week4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array :");
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + "th String :");
            a[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            String b = a[i].toLowerCase();
            int count = 0;
            for (int j = 0; j < b.length(); j++) {
                char c = b.charAt(j);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count += 1;
                }
            }
            System.out.println("Number of Vowels = " + count);
            System.out.println("Number of Consonants = " + (b.length() - count));
        }
    }
}