import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        
        char[][] input = new char[m][n];
        
        for(int i=0; i<m; i++) {
        	String line = sc.next();
        	for(int j=0; j<n; j++) {
        		input[i][j] = line.charAt(j);
        	}
        }
        
        int res = cal(input, 0, 0);
        int tmp = 0;
        
        for(int i=0; i<m-7; i++) {
        	for(int j=0; j<n-7; j++) {
        		tmp = cal(input, i, j);
        		if (res > tmp) {
        			res = tmp;
        		}
        	}
        }
        
        System.out.println(res);
        
    }
    
    public static int cal(char[][] input, int x, int y) {
    	
    	int cnt = 0, cnt1 = 0, cnt2 = 0;
        
        // 기준점이 흰색인 경우
        for(int i=x; i<x+8; i++) {
        	for(int j=y; j<y+8; j++) {
        		if ((x+y) % 2 == 0) {	// 기준점이 짝수인 경우
        			if ((i+j) % 2 == 0) {
           				if (input[i][j] == 'B') {
           					cnt1++;
           				}
           			}
           			else if ((i+j) % 2 == 1) {
           				if (input[i][j] == 'W') {
           					cnt1++;
           				}
           			}
        		}
        		else if ((x+y) % 2 == 1) {	// 기준점이 홀수인 경우
        			if ((i+j) % 2 == 1) {
           				if (input[i][j] == 'B') {
           					cnt1++;
           				}
           			}
           			else if ((i+j) % 2 == 0) {
           				if (input[i][j] == 'W') {
           					cnt1++;
           				}
           			}
        		}
        	}
        }
                
        // 기준점이 검은색인 경우
        for(int i=x; i<x+8; i++) {
        	for(int j=y; j<y+8; j++) {
        		if ((x+y) % 2 == 0) {	// 기준점이 짝수인 경우
        			if ((i+j) % 2 == 0) {
           				if (input[i][j] == 'W') {
           					cnt2++;
           				}
           			}
           			else if ((i+j) % 2 == 1) {
           				if (input[i][j] == 'B') {
           					cnt2++;
           				}
           			}
        		}
        		else if ((x+y) % 2 == 1) {	// 기준점이 홀수인 경우
        			if ((i+j) % 2 == 1) {
           				if (input[i][j] == 'W') {
           					cnt2++;
           				}
           			}
           			else if ((i+j) % 2 == 0) {
           				if (input[i][j] == 'B') {
           					cnt2++;
           				}
           			}
        		}
        	}
        }
        
        cnt = Math.min(cnt1, cnt2);
            	
    	return cnt;
    }
    
}