import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();    // 낮에 올라가는 미터
        int b = sc.nextInt();    // 밤에 미끄러지는 미터
        int v = sc.nextInt();    // 나무 막태 높이
        int n = 0;    // 현재 높이
        int d = (v - b) / (a - b);    // 며칠 걸리는지
        
        if ((v - b) % (a - b) != 0) {
            d += 1;
        }
        
        System.out.println(d);
    }
}