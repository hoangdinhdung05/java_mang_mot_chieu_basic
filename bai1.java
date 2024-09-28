
import java.util.*;

public class bai1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int dc = 0, dl = 0, tc = 0, tl = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                dc++;
                tc += arr[i];
            }
            else{
                dl++;
                tl += arr[i];
            }
        }

        System.out.println(dc);
        System.out.println(dl);
        System.out.println(tc);
        System.out.println(tl);
    }
}
