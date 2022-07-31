import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();
        int X;
        int[] x;
        x = new int[n];

        for (int i = 1; i <= n; i++) {
            n--;
            x[n] = i;
        }

        if (A - x[n] == B + x[n]) {
            X = A - x[n];

            if (A == X + x[n] && B == X - x[n]) {
                System.out.println("YES");
            }
        }
        else {
            System.out.println("NO");
        }
        // A = X + x1 + x2... + Xn
        // B = X - x1 - x2 ... -xn
        // 3 5 1 = NO
        // 5 3 1 = YES

    }
}
