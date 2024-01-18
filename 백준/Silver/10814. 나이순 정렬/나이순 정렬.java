import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        String[][] sArr = new String[n][3];
        
        for(int i=0; i<n; i++) {
        	String line = sc.nextLine();
        	String[] parts = line.split(" ", 2);
        	
        	sArr[i][0] = parts[0];	// 나이
        	sArr[i][1] = parts[1];	// 이름
        	sArr[i][2] = Integer.toString(i);	// 가입 순서
        }
        
        Arrays.sort(sArr, new Comparator<String[]>() {
        	@Override
        	public int compare(String[] s1, String[] s2) {
        		if(s1[0] == s2[0])
        			return Integer.parseInt(s1[2]) - Integer.parseInt(s2[2]);
        		else
        			return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
        	}
        });
//        
        for(int i=0; i<n; i++) {
        	System.out.println(sArr[i][0] + " " + sArr[i][1]);
        }
        
    }
    
}