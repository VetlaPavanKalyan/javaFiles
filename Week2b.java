import java.util.Scanner;

public class Week2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Financial Years :");
        int m =sc.nextInt();
        System.out.println("Enter the Ids of the items :");
        int n = sc.nextInt();
        int[] years = new int[m];
        int[] id = new int[n];
        int[][] a = new int[m][n];
        System.out.println("Enter the Financial Years :");
        for(int i=0;i<m;i++){
            id[i]=sc.nextInt();
        }
        System.out.println("Enter the Ids :");
        for(int i=0;i<n;i++){
            years[i]=sc.nextInt();
        }
        System.out.println("Enter the Demand of the Items :");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter demand of the item in the year "+years[i]+" with the item id "+id[j]);
                a[i][j]=sc.nextInt();
            }
        }
        int k = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(k<a[i][j]){
                    k=a[i][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(k==a[i][j]){
                    System.out.println("Most demanded Item with id "+id[i]+" is found in year "+years[j]+" with demand "+k);
                }
            }
        }
    }
}
