import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();    // 색종이의 개수
        int[][] input = new int[a][2];    // 색종이 꼭지점의 좌표
        
        for(int i=0; i<a; i++) {
            for(int j=0; j<2; j++) {
                input[i][j] = sc.nextInt();
            }
        }
        
        int[][] canvas = new int[100][100];    // 도화지 초기화
        int sum = 0;    // 넓이
        
        for(int i=0; i<a; i++) {    // 색종이의 개수 반큼 반복
            for(int j=input[i][0]; j<input[i][0]+10; j++) {    // 색종이 크기만큼 반복
                for(int k=input[i][1]; k<input[i][1]+10; k++) {
                    if (canvas[j][k] == 0) {
                        sum += 1;
                        canvas[j][k] = 1;
                    }
                }
            }
        }
        
        System.out.println(sum);
        sc.close();
    }
}
