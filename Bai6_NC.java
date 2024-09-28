// package Java;

import java.util.*;

public class Bai6_NC {

    public static int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(gcd(a.get(i), a.get(j)) == 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
