import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[9][9];
    
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        sc.close();
    
        int m = arr[0][0];
        int x = 1;
        int y = 1;
        
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if (arr[i][j] > m) {
                    m = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
    
        System.out.println(m);
        System.out.print(x + " " + y);
    }
}