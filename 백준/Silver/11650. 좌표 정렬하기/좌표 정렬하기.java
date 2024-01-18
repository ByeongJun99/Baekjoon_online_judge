import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        
        for(int i=0; i<n; i++) {
        	arr[i][0] = sc.nextInt();
        	arr[i][1] = sc.nextInt();
        	sc.nextLine();
        }
        
//        int tmp;
//        
//        for(int i=0; i<n-1; i++) {
//        	for(int j=i; j<n; j++) {
//        		if(arr[i][0] > arr[j][0]) {
////        			change(arr[i][0], arr[j][0]);
//        			tmp = arr[i][0];
//        			arr[i][0] = arr[j][0];
//        			arr[j][0] = tmp;
////        			change(arr[i][1], arr[j][1]);
//        			tmp = arr[i][1];
//        			arr[i][1] = arr[j][1];
//        			arr[j][1] = tmp;
//        		}
//        		else if(arr[i][0] == arr[j][0]) {
//        			if(arr[i][1] > arr[j][1]) {
////        				change(arr[i][0], arr[j][0]);
//            			tmp = arr[i][0];
//            			arr[i][0] = arr[j][0];
//            			arr[j][0] = tmp;
////            			change(arr[i][1], arr[j][1]);
//            			tmp = arr[i][1];
//            			arr[i][1] = arr[j][1];
//            			arr[j][1] = tmp;
//        			}
//        		}
//        	}
//        }
        
        Arrays.sort(arr, (o1, o2) -> {
        	if(o1[0] == o2[0])
        		return Integer.compare(o1[1], o2[1]);
        	else
        		return Integer.compare(o1[0],  o2[0]);
        });
        
        for(int i=0; i<n; i++) {
        	System.out.println(arr[i][0] + " " + arr[i][1]);
        }
        
    }
    
}