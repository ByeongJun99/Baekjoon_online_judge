import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int[] input = new int[5];
        
        for(int i=0; i<5; i++) {
        	input[i] = sc.nextInt();
        }
        
        Arrays.sort(input);
        int sum = 0;
        
        for(int i=0; i<5; i++) {
        	sum += input[i];
        }
        System.out.println(sum / 5);
        
        System.out.println(input[2]);
        
    }
    
}