import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();    // t 입력
        String[] a = new String[t];
        
        for(int i=0; i<t; i++) {    // t번 반복
            String s = sc.next();    // 문자열 입력
            a[i] = s;
        }
        
        for(int i=0; i<t; i++) {
            System.out.print(a[i].charAt(0));
            System.out.println(a[i].charAt(a[i].length()-1));
        }
    }
}