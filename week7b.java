import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class week7b {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int op, i, ele;
        for (int j = 0; j <= 10; j++) {
            a.add(r.nextInt(10));
        }
        while (true) {
            System.out.println("OPTIONS : 1.ADD 2.GET 3.REMOVE 4.SET 5.CLEAR 6.SIZE 7.PRINT LIST 8.SORT 9.EXIT");
            System.out.println("Enter your Choice");
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("Enter the element : ");
                    ele = sc.nextInt();
                    a.add(ele);
                }
                case 2 -> {
                    System.out.println("Enter Index : ");
                    i = sc.nextInt();
                    System.out.println(a.get(i));
                }
                case 3 -> {
                    System.out.println("Enter Index : ");
                    i = sc.nextInt();
                    a.remove(i);
                }
                case 4 -> {
                    System.out.println("Enter the element : ");
                    ele = sc.nextInt();
                    System.out.println("Enter Index : ");
                    i = sc.nextInt();
                    a.set(i, ele);
                }
                case 5 -> {
                    a.clear();
                    System.out.println("List is Cleared!!!");
                }
                case 6 -> {
                    ele = a.size();
                    System.out.println("Size of the list is : " + ele);
                }
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
