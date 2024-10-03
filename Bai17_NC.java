import java.util.*;

public class Bai17_NC {
    // public static long[] F = {0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] F = new long[n+1];
        int[] a = new int[n+1];
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
            F[i] = F[i-1] + a[i];
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(F[r] - F[l - 1]);
        }
    }
}
