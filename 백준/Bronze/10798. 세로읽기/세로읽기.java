import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] input = new String[5];
        
        for(int i=0; i<5; i++) {
            input[i] = sc.nextLine();
        }
        sc.close();
        
        for(int j=0; j<15; j++) {
            for(int i=0; i<5; i++) {
                if (j < input[i].length() && input[i].charAt(j) != ' ') {
                	System.out.print(input[i].charAt(j));
                }
            }
        }
        
    }
}