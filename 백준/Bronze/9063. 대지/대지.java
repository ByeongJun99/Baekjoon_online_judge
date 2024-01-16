import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int x_axis[] = new int[n]; //x좌표 배열 따로
        int y_axis[] = new int[n]; //y좌표 배열 따로

        for(int i  = 0; i < n; i++){
            //어차피 token for문 안에서만 쓰니까
            StringTokenizer token = new StringTokenizer(br.readLine());
            x_axis[i] = Integer.parseInt(token.nextToken());
            y_axis[i] = Integer.parseInt(token.nextToken());
        }
        br.close();
        //작은 수부터 큰 수로 정렬하는 (즉, index가 작으면 작은수, index가 크면 큰 수)
        Arrays.sort(x_axis);
        Arrays.sort(y_axis);

        System.out.println((x_axis[n-1]-x_axis[0])*(y_axis[n-1]-y_axis[0]));
        
    }
}