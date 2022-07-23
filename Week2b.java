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
        int k = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("Enter demand of the item in the year "+id[i]+" with the item id "+years[j]);
                a[i][j]=sc.nextInt();
                if(k<a[i][j]){
                    k=a[i][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(k==a[i][j]){
                    int t=id[i];
                    int b=years[j];
                    System.out.println("id = "+t+"year = "+b+"demand = "+k);
                    break;
                }
            }
        }
    }
}
