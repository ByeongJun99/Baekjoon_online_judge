import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=1; i<n+1; i++) {    // 피라미드 모양
            for(int j=1; j<n-i+1; j++) {    // 공백 찍기
                System.out.print(" ");
            }
            for(int j=1; j<2*i; j++) {    // 별 찍기
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=1; i<n; i++) {    // 역피라미드 모양
            for(int j=1; j<i+1; j++) {    // 공백 찍기
                System.out.print(" ");
            }
            for(int j=1; j<(2*n)-(2*i); j++) {    // 별 찍기
                System.out.print("*");
            }
            System.out.println();
        }
    }
}