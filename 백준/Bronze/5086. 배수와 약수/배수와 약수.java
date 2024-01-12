import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;	// 입력받은 정수
		int i = 0;	// 입력받은 개수
		
		String[] res = new String[100];
		
		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			sc.nextLine();
			
			if ((a==0) && (b==0)) {
				break;
			}
			
			if (b % a == 0) {
				res[i] = "factor";
			}
			else if (a % b == 0) {
				res[i] = "multiple";
			}
			else {
				res[i] = "neither";
			}
			
			i++;
		}
		
		for(int j=0; j<i; j++) {
			System.out.println(res[j]);
		}
		
	}

}