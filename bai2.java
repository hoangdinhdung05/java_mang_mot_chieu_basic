import java.util.*;

public class bai2 {

    public static boolean check(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i <n; i++){
            a[i] = sc.nextInt();
        }
        int tong = 0, dem = 0;
        for(int i = 0; i < n; i++){
            if(check(a[i])){
                dem++;
                tong += a[i];
            }
        }
        double ps = (double)tong / dem;
        System.out.printf("%.3f", ps);
    }
}
