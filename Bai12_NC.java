import java.util.*;

public class Bai12_NC {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> primeCount = new LinkedHashMap<>(); // Đảm bảo duy trì thứ tự
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (isPrime(x)) {
                primeCount.put(x, primeCount.getOrDefault(x, 0) + 1);
            }

            // if(check(x)){
            //     if(mp.containsKey(x)){
            //         int ts = mp.get(x);
            //         ts++;
            //         mp.put(x, ts);
            // }
            // else{
            //         mp.put(x, 1);
            // }
        }
        sc.close();


        for (Map.Entry<Integer, Integer> entry : primeCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
