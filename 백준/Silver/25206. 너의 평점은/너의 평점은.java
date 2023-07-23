import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = 0;    // 학점 * 과목평점
        double b = 0;    // 총학점
        
        for(int i=0; i<20; i++) {
            String title = sc.next();    // 과목
            double c = sc.nextDouble();    // 학점
            String d = sc.next();    // 평점
            
            if (d.equals("A+")) {
                a += c * 4.5;
                b += c;
            }
            else if (d.equals("A0")) {
                a += c * 4.0;
                b += c;
            }
            else if (d.equals("B+")) {
                a += c * 3.5;
                b += c;
            }
            else if (d.equals("B0")) {
                a += c * 3.0;
                b += c;
            }
            else if (d.equals("C+")) {
                a += c * 2.5;
                b += c;
            }
            else if (d.equals("C0")) {
                a += c * 2.0;
                b += c;
            }
            else if (d.equals("D+")) {
                a += c * 1.5;
                b += c;
            }
            else if (d.equals("D0")) {
                a += c * 1.0;
                b += c;
            }
            else if (d.equals("F")) {
                a += c * 0.0;
                b += c;
            }
        }
        System.out.printf("%.6f", a/b);
    }
}