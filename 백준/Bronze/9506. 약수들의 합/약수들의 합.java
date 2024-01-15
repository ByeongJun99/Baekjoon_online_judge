import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];	// 입력받은 정수의 배열
		int i = 0;	// 입력받은 정수의 개수
		
		while (true) {
			int input = sc.nextInt();
			arr[i] = input;
			if (input == -1) {
				break;
			}
			i++;
		}
		
		for(int j=0; j<i; j++) {
			isPerfect(arr[j]);
			System.out.println();
		}
		
	}
	
	public static void isPerfect(int n) {
		int[] arr2 = new int[100];	// 약수의 배열
		int sum = 0;	// 약수의 합
		int m = 0;	// 약수의 개수
		int idx = 0;
		
		for(int i=1; i<n; i++) {
			if (n % i == 0) {
				sum += i;
				arr2[idx] = i;
				m++;
				idx++;
			}
		}
		
		if (sum == n) {
			System.out.print(n + " =");
			for(int i=0; i<m; i++) {
				System.out.print(" " + arr2[i] + " ");
				if (arr2[i+1] != 0) {
					System.out.print("+");
				}
			}
		}
		else {
			System.out.print(n + " is NOT perfect.");
		}
	}

}
