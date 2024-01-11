import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int[] arr = new int[t];
        
        for(int i=0; i<t; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<t; i++) {
            int[] arr2 = new int[4];
            
            arr2[0] = arr[i] / 25;	// 쿼터 개수
            int a = arr[i] % 25;	// 쿼터 주고 남은 금액
            
            arr2[1] = a / 10;	// 다임 개수
            int b = a % 10;		// 다임 주고 남은 금액
            
            arr2[2] = b / 5;	// 니켈 개수
            int c = b % 5;		// 니켈 주고 남은 금액
            
            arr2[3] = c;		// 페니 개수
            
            System.out.printf("%d %d %d %d\n", arr2[0], arr2[1], arr2[2], arr2[3]);
        }
        
        sc.close();
		
	}

}
