import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] st = new int[n];
        
        for(int i=0; i<n; i++) {
        	st[i] = sc.nextInt();
        }
        
        Arrays.sort(st);
        
        System.out.println(st[n-k]);
        
    }
    
}