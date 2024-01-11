import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        int b = sc.nextInt();
        
        long result = 0;
        int idx = 0;    // 제곱
        int num = 0;    // 각 자리 수를 10진수로 변경
        
        for(int i=n.length()-1; i>=0; i--) {
            char c = n.charAt(i);
            if ((c >= '0') && (c <= '9')) {
                num = c - '0';
            }
            else {
                num = c - 55;
            }
            result += num * Math.pow(b, idx++);
        }
        
        System.out.println(result);
    }
}