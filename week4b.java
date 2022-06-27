import java.util.*;

public class week4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String :");
        String x = sc.next();
        System.out.print("Enter 2nd String :");
        String y = sc.next();
        String a = sortString(x);
        String b = sortString(y);
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("NOT Anagram");
        }
    }

    private static String sortString(String arg) {
        char[] temp = arg.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}
