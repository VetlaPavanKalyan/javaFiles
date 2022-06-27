import java.util.Scanner;

public class week1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time like this :e.g. 07:05:45PM:");
        String x = sc.nextLine();
        String[] time = x.split(":");
        int hrs = Integer.parseInt(time[0]);
        int mins = Integer.parseInt(time[1]);
        int secs = Integer.parseInt(time[2].substring(0, 2));
        String mer = time[2].substring(2, 4);
        if (mer.equalsIgnoreCase("PM")) {
            if (hrs != 12) {
                hrs = hrs + 12;
            }
        }
        if (mer.equalsIgnoreCase("AM")) {
            if (hrs == 12) {
                hrs = 0;
            }
        }
        System.out.print(hrs+ ":"+mins+":"+secs);
    }
}
