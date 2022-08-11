import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int n;
        int i;
        int res = 0;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for(int j = 0; j<n; j++) {
            a[j] = sc.nextInt();
        }
        if(a[c] <= a[c++]) {
            res = a[c++] - a[c];
            a[n] = res;
            c++;
        }
        System.out.println(res);
    }
}
