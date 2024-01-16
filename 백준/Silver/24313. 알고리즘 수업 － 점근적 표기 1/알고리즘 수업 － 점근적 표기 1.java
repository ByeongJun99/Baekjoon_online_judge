import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        sc.nextLine();
        int c = sc.nextInt();
        int n = sc.nextInt();
        
        if (((Math.abs(c - a1)) * n >= a0) && (c >= a1)) {
        	System.out.println(1);
        }
        else {
        	System.out.println(0);
        }
        
    }
}