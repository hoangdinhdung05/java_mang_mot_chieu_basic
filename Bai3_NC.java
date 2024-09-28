

import java.util.*;

public class Bai3_NC {


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }
        int max_val = 0;
        for(int i = 0; i < n; i++){
            if(a.get(i) > max_val){
                max_val = a.get(i);
                System.out.printf("%d ", a.get(i));
            }
        }
        sc.close();
    }
}
