// package Java;

import java.util.*;

public class Bai5_NC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println((a.get(1) - a.get(0)) + " " + (a.get(n - 1) - a.get(0)));


        for (int i = 1; i < n - 1; i++) {
            int min = Math.min(a.get(i) - a.get(i - 1), a.get(i + 1) - a.get(i));
            int max = Math.max(a.get(i) - a.get(0), a.get(n - 1) - a.get(i));
            System.out.println(min+ " " + max);
        }


        System.out.println((a.get(n - 1) - a.get(n - 2)) + " " + (a.get(n - 1) - a.get(0)));

        sc.close();
    }
}
