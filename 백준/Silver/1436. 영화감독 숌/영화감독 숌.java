import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean cont;
        int cnt = 0;
        
        int i = 666;
        
        while(true) {
        	String str = Integer.toString(i);
        	cont = str.contains("666");
        	if (cont) {
        		cnt++;
        	}
        	if (cnt == n) {
        		System.out.println(Integer.parseInt(str));
        		break;
        	}
        	i++;
        }
        
    }
    
}