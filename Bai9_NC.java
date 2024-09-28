import java.util.*;

// In ra tần suất xuất hiện của các phần tử theo thứ tự từ nhỏ tới lớn sau đó bỏ trống 1 dòng và in ra tần suất xuất hiện của các phần tử theo thứ tự xuất hiện trong mảng(mỗi giá trị chỉ liệt kê 1 lần).

public class Bai9_NC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeMap<Integer, Integer> map = new TreeMap<>();
        int n = sc.nextInt();
        int[] a = new int[n];

        // Input and frequency count
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            map.merge(a[i], 1, Integer::sum); // Merge function for frequency counting
        }

        // Display the frequency map
        map.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println();

        // Second loop to print and remove elements
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                System.out.println(a[i] + " " + map.get(a[i]));
                map.remove(a[i]);
            }
        }

        sc.close();
    }
}
