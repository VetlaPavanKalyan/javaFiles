import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class week7b {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int op,i,ele;
        while(true){
            System.out.println("OPTIONS : 1.ADD 2.GET 3.REMOVE 4.SET 5.CLEAR 6.SIZE 7.PRINT LIST 8.SORT 9.EXIT");
            System.out.println("Enter your Choice");
            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("Enter the element : ");
                    ele = sc.nextInt();
                    a.add(ele);
                    break;
                case 2:
                    System.out.println("Enter Index : ");
                    i = sc.nextInt();
                    System.out.println(a.get(i));
                    break;
                case 3:
                    System.out.println("Enter Index : ");
                    i = sc.nextInt();
                    a.remove(i);
                    break;
                case 4:
                    System.out.println("Enter the element : ");
                    ele = sc.nextInt();
                    System.out.println("Enter Index : ");
                    i = sc.nextInt();
                    a.set(i,ele);
                    break;
                case 5:
                    a.clear();
                    System.out.println("List is Cleared!!!");
                    break;
                case 6:
                    ele = a.size();
                    System.out.println("Size of the list is : "+ele);
                    break;
                case 7:
                    for(int x : a){
                        System.out.print(x);
                    }
                    System.out.println("");
                    break;
                case 8:
                    Collections.sort(a);
                    break;
                case 9:
                    System.out.println("Exited!!!");
                    System.exit(0);
                    break;
            }
        }
    }
}
