import java.util.*;

public class Bai13_NC {

    public static int[] a = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cnt = 0;
        int i = 0;
        while (n > 0) {
            cnt += n / a[i];
            n %= a[i];
            i++;
        }
        System.out.println(cnt);
    }    
}
