import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        char[] a = s.toCharArray();
        char[] b = new char[a.length];
        
        for(int i=0; i<a.length; i++) {
            b[i] = a[a.length-1-i];
        }
        
        boolean z = true;
        for(int i=0; i<a.length; i++) {
            if (a[i] != b[i]) {
                z = false;
            }
        }
        if (z == true) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}