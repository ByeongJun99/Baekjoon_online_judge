import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        
        for (int i=0; i<n; i++) {    // 행렬 A의 행
            for (int j=0; j<m; j++) {    // 행렬 A의 열
                a[i][j] = sc.nextInt();
            }
        }
        
        for (int i=0; i<n; i++) {    // 행렬 B의 행
            for (int j=0; j<m; j++) {    // 행렬 B의 열
                b[i][j] = sc.nextInt();
            }
        }
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(a[i][j]+b[i][j] + " ");
            }
            System.out.println();
        }
    }
}