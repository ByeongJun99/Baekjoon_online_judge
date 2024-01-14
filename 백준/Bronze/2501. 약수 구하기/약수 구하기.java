import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 입력받은 정
		int k = sc.nextInt();	// 찾고자 하는 약수의 순서
		int cnt = 0;	// 약수의 개수 세는 정수
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				cnt++;
			}
			
			if(cnt == k) {
				System.out.println(i);
				break;
			}
		}
		
		if(cnt < k) {
			System.out.println(0);
		}
		
	}

}
