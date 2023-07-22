import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] a = {1, 1, 2, 2, 2, 8};
        int[] b = new int[6];    // 입력받은 숫자 배열
        int[] c = new int[6];    // 출력할 숫자 배열
        
        for(int i=0; i<6; i++) {
            int d = sc.nextInt();
            b[i] = d;
        }
        
        for(int i=0; i<6; i++) {
            c[i] = a[i] - b[i];
            System.out.print(c[i] + " ");
        }
    }
}