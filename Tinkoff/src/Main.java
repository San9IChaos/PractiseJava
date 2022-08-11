import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sqr1 = 0;
        int sqr2 = 0;
        int res;
        int x1;
        int x2;
        int y1;
        int y2;
        int x1_2;
        int x2_2;
        int y1_2;
        int y2_2;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        x1_2 = sc.nextInt();
        y1_2 = sc.nextInt();
        x2_2 = sc.nextInt();
        y2_2 = sc.nextInt();
        if (x1 >= 0 && x1 < x2 && x2 < 10) {
            if (y1 >= 0 && y1 < y2 && y2 < 10) {
                sqr1 = (x2 - x1) * (y2 - y1);
                System.out.println("Sqr 1 = " + sqr1);
            }
            if (x1_2 >= 0 && x1_2 < x2_2 && x2_2 < 10) {
                if (y1_2 >= 0 && y1_2 < y2_2 && y2_2 < 10) {
                    sqr2 = (x2_2 - x1_2) * (y2_2 - y1_2);
                    System.out.println("Sqr 2 = " + sqr2);
                }
                res = (sqr1 + sqr2) * (sqr1 + sqr2);
                System.out.println(res);
            }
        }
    }
}