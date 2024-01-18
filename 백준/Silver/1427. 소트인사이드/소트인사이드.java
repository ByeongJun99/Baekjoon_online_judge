import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        int[] arr = new int[input.length()];
        
        for(int i=0; i<input.length(); i++) {
        	arr[i] = Character.getNumericValue(input.charAt(i));
        }
        
        Arrays.sort(arr);
        
        for(int i=input.length()-1; i>=0; i--) {
        	System.out.print(arr[i]);
        }
        
    }
    
}