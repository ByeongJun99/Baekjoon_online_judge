import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        String[] res = new String[100];
        int i = 0;
        
        while(true) {
        	int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
        	int max = Math.max(Math.max(a, b), c);
        	
        	if ((a == 0) && (b == 0) && (c == 0)) {
        		break;
        	}
        	else {
            	
            	if ((a == b) && (b == c)) {
            		res[i] = "Equilateral";
            	}
            	else if (max >= (a + b + c - max)) {
            		res[i] = "Invalid";
            	}
            	else if ((a == b) || (b == c) || (c == a)) {
            		res[i] = "Isosceles";
            	}
            	else if ((a != b) && (b != c) && (c != a)) {
            		res[i] = "Scalene";
            	}
            	else {
            		res[i] = "Invalid";
            	}
            	
            	i++;
        		
        	}
        	
        }
        
        for(int j=0; j<i; j++) {
        	System.out.println(res[j]);
        }
        
    }
}