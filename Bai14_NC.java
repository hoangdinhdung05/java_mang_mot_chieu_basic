import java.util.*;

public class Bai14_NC {

    // Hàm kiểm tra số có phải là tăng dần từ trái sang phải
    public static boolean check(int n) {
        while (n >= 10) {
            int r = n % 10;
            int l = (n / 10) % 10;
            if (r < l) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    // Comparator để sắp xếp theo tần suất giảm dần, nếu tần suất bằng thì sắp xếp theo giá trị tăng dần
    public static Comparator<Map.Entry<Integer, Integer>> cmp = new Comparator<>() {
        @Override
        public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue(); // Sắp xếp giảm dần theo tần suất
            } else {
                return a.getKey() - b.getKey(); // Sắp xếp tăng dần theo giá trị
            }
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> mp = new HashMap<>(); // Dùng HashMap để lưu giá trị và tần suất

        // Đọc dữ liệu
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (check(n)) {
                mp.put(n, mp.getOrDefault(n, 0) + 1);
            }
        }

        // Chuyển từ Map sang List để sắp xếp
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mp.entrySet());

        // Sắp xếp với comparator đã định nghĩa
        list.sort(cmp);

        // In ra kết quả
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        sc.close();
    }
}
