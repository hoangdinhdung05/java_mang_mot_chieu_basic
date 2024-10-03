// package Java;

import java.util.*;

public class Bai11_NC {

    public static int[] d1 = new int[10000005];
    public static int[] d2 = new int[10000005];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int j = 0; j < m; j++){
            b[j] = sc.nextInt();
        }

        int i = 0, j = 0;

        ArrayList<Integer> giao = new ArrayList<>();
        ArrayList<Integer> hop = new ArrayList<>();

        while(i < n && j < m){
            if(a[i] == b[j]){
                giao.add(a[i]);
                hop.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                hop.add(a[i]);
                i++;
            }
            else{
                hop.add(b[j]);
                j++;
            }
        }

        while(i < n) hop.add(a[i++]);
        while(j < m) hop.add(b[j++]);

        for(int x : hop) System.out.print(x + " ");
        System.out.println();
        for(int x : giao) System.out.print(x + " ");
        sc.close();
    }
}
