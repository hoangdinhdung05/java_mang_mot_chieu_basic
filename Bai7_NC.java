// package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai7_NC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer t, Integer t1) {
                // Odd numbers come before even numbers
                if (t % 2 == 1 && t1 % 2 == 0) {
                    return -1;
                }
                if (t % 2 == 0 && t1 % 2 == 1) {
                    return 1;
                }
                // Both are even or both are odd
                if (t % 2 == 0 && t1 % 2 == 0) {
                    // Sort even numbers in ascending order
                    return t - t1;
                }
                // Sort odd numbers in descending order
                return t1 - t;
            }
        });

        for (int x : a) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
