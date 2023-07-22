import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s;
        int cnt = 0;
        
        for(int i=0; i<n; i++) {    // n번 반복
            s = sc.next();
            boolean check[] = new boolean[26];
            boolean tmp = true;
            
            for(int j=0; j<s.length(); j++) {    // 입력받은 문자열 분석
                int p = s.charAt(j)-'a';
                if(check[p]) {
                    if(s.charAt(j) != s.charAt(j-1)) {
                        tmp = false;
                        break;
                    }
                }
                else {
                    check[p] = true;
                }
            }
            if(tmp) cnt++;
        }
        System.out.print(cnt);
    }
}