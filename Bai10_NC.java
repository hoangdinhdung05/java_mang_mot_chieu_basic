import java.util.*;

public class Bai10_NC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        // Sử dụng HashSet để lưu phần tử của mảng a
        HashSet<Integer> set1 = new HashSet<>();
        // Sử dụng HashSet để lưu phần tử của mảng b
        HashSet<Integer> set2 = new HashSet<>();
        // Sử dụng TreeSet để lưu tập hợp hợp
        TreeSet<Integer> hop = new TreeSet<>();
        // Sử dụng TreeSet để lưu giao nhau
        TreeSet<Integer> giao = new TreeSet<>();

        // Đọc dữ liệu cho mảng a và lưu vào set1 và hop
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            set1.add(a[i]);
            hop.add(a[i]);
        }

        // Đọc dữ liệu cho mảng b và lưu vào set2 và hop
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            set2.add(b[i]);
            hop.add(b[i]);
            // Kiểm tra giao nhau
            if (set1.contains(b[i])) {
                giao.add(b[i]);
            }
        }

        // In giao nhau
        for (int x : giao) {
            System.out.print(x + " ");
        }
        System.out.println();

        // In hợp
        for (int x : hop) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
