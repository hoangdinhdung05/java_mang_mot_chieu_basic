import java.util.Scanner;

public class Bai2_NC {

    public static boolean tang(int a[], int n){
        for(int i = 1; i < n; i++){
            if(a[i] <= a[i-1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        if(tang(a, n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
