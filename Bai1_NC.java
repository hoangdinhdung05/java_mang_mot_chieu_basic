import java.util.*;

public class Bai1_NC {

    // Kiểm tra số nguyên tố
    public static boolean nt(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Kiểm tra mảng đối xứng
    public static boolean doixung(ArrayList<Integer> a) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            if (!a.get(l).equals(a.get(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a.add(x);
            b.add(x);
        }

        int max_val = a.get(0), max_pos = 0;
        int min_val = a.get(0), min_pos = 0;
        int dem_nt = 0;
        for (int i = 0; i < n; i++) {
            if (a.get(i) > max_val) {
                max_val = a.get(i);
                max_pos = i;
            }

            if (a.get(i) <= min_val) {
                min_val = a.get(i);
                min_pos = i; 
            }

            if (nt(a.get(i))) {
                dem_nt++;
            }
        }
        System.out.println(max_val + " " + max_pos);
        System.out.println(min_val + " " + min_pos);
        System.out.println(dem_nt);

        // Sắp xếp và tính toán
        Collections.sort(a);
        long t1 = (long) a.get(n - 1) * a.get(n - 2);
        long t2 = (long) a.get(0) * a.get(1);
        System.out.println(Math.max(t1, t2));

        // Kiểm tra đối xứng
        if (doixung(b)) System.out.println("YES");
        else System.out.println("NO");

        // Tính tích các phần tử với modulo
        long tich = 1;
        int mod = (int)1e9 + 7;
        for (int x : b) {
            tich = (tich * x) % mod;
        }
        System.out.println(tich);

        sc.close();
    }
}

