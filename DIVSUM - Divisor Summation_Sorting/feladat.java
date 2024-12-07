import java.util.*;

public class PairDifference {
    public static int countPairs(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        
        for (int num : arr) {
            if (set.contains(num - k)) {
                count++;
            }
            if (set.contains(num + k)) {
                count++;
            }
            set.add(num);
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(countPairs(arr, k));
    }
}
