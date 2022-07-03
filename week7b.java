import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class week7b {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int j = 0; j <= 10; j++) {
            a.add(r.nextInt(10));
        }
        while (true) {
            System.out.println("OPTIONS : 1.ADD 2.GET 3.REMOVE 4.SET 5.CLEAR 6.SIZE 7.PRINT LIST 8.SORT 9.EXIT");
            System.out.println("Enter your Choice");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println("Enter the element : ");
                    a.add(sc.nextInt());
                }
                case 2 -> {
                    System.out.println("Enter Index : ");
                    System.out.println(a.get(sc.nextInt()));
                }
                case 3 -> {
                    System.out.println("Enter Index : ");
                    a.remove(sc.nextInt());
                }
                case 4 -> {
                    System.out.println("Enter Index : ");
                    System.out.println("Enter the element : ");
                    a.set(sc.nextInt(), sc.nextInt());
                }
                case 5 -> {
                    a.clear();
                    System.out.println("List is Cleared!!!");
                }
                case 6 -> System.out.println("Size of the list is : " + a.size());
                case 7 -> {
                    for (int x : a) {
                        System.out.print(x + " ");
                    }
                    System.out.println();
                }
                case 8 -> Collections.sort(a);
                case 9 -> {
                    System.out.println("Exited!!!");
                    System.exit(0);
                }
            }
        }
    }
}
