// package Java;

import java.util.*;

// Cho 2 mảng đã được sắp xếp tăng dần, thực hiện trộn 2 dãy trên thành một dãy được sắp xếp.



public class Bai8_NC {

    public static void meger(int[] a, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] x = new int[n1];
        int[] y = new int[n2];
        for(int i = l; i <= m; i++){
            x[i-l] = a[i];
        }
        for(int i = m + 1; i <= r; i++){
            y[i-m-1] = a[i];
        }
        int i = 0, j = 0, cnt = l;
        while(i < n1 && j < n2){
            if(x[i] <= y[j]){
                a[cnt++] = x[i++];
            }
            else{
                a[cnt++] = y[j++];
            }
        }
        while(i < n1) a[cnt++] = x[i++];
        while(j < n2) a[cnt++] = y[j++];
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n + m];
        int[] b = new int[m];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            a[n+i] = b[i];
        }
        meger(a, 0, n-1, n+m-1);
        for(int i = 0; i < n + m; i++){
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
