import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int res = 1; // n의 생성자
        int sum;     // res의 분해합

        while (res < n) {
            sum = res; // res의 분해합 초기화
            int temp = res;

            while (temp > 0) {
                sum += temp % 10; // 각 자릿수 더하기
                temp /= 10;
            }

            if (sum == n) {
                System.out.println(res);
                return;
            }

            res++;
        }

        System.out.println(0);
    }
}
