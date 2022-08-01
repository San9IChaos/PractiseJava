import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = a * b;
        long e;
        long f;
        int i = 0;

        if (b > a) {
            e = a * a;

            if (b % a == 0) {
                while (c != 0) {
                    c = c - e;
                    i++;
                }
                System.out.println(i);
            } else {
                f = b % a;
                c = c - e;
                i++;
                while (c != 0) {
                    c = c - f;
                    i++;
                }
                System.out.println(i);
            }
        }
    else {
         e = b*b;

        if (a % b == 0) {
            while (c != 0) {
                c = c - e;
                i++;
            }
            System.out.println(i);
        } else {
            f = a % b;
            c = c - e;
            i++;
            while (c != 0) {
                c = c - f;
                i++;
            }
            System.out.println(i);
        }
    }
    }
}