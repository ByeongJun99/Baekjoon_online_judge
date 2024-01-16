import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int[] angle = new int[3];
        
        for(int i=0; i<3; i++) {
        	angle[i] = sc.nextInt();
        }
        
        Arrays.sort(angle);
        
        if (angle[0] + angle[1] + angle[2] != 180) {
        	System.out.println("Error");
        }
        else {
        	if (angle[0] == 60 && angle[1] == 60 && angle[2] == 60) {
            	System.out.println("Equilateral");
            }
        	else if ((angle[0] == angle[1]) || (angle[0] == angle[2]) || (angle[1] == angle[2])) {
        		System.out.println("Isosceles");
        	}
        	else if ((angle[0] != angle[1]) && (angle[1] != angle[2])) {
        		System.out.println("Scalene");
        	}
        }
        
    }
}