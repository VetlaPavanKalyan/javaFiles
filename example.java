import java.util.*;


public class example {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Random r = new Random();
        for (int i = 1; i <= 10; i++) {
            a.add(r.nextInt(10 - 5) + 5);
        }
        for (int x : a) {
            System.out.print(x);
        }
        Set<Integer> set = new HashSet<>();
        while (true) {
            int j = r.nextInt(9 - 5) + 5;
            System.out.println(j);
            if (!set.contains(j)) {
                set.add(j);
                if (a.get(j) == 9) {
                    System.out.println("Found");
                    System.exit(0);
                } else {
                    System.out.println("Not Found");
                }
            }
        }
    }
}
