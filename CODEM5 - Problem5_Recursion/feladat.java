import java.util.*;

public class MinimumObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] weights = new int[n];
            for (int i = 0; i < n; i++) {
                weights[i] = sc.nextInt();
            }
            int result = findMinimumObjects(weights, n, k);
            if (result == Integer.MAX_VALUE) {
                System.out.println("impossible");
            } else {
                System.out.println(result);
            }
        }
        sc.close();
    }

    private static int findMinimumObjects(int[] weights, int n, int k) {
        int minObjects = Integer.MAX_VALUE;
        int totalCombinations = 1 << n; // 2^n combinations
        for (int mask = 0; mask < totalCombinations; mask++) {
            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) { // Check if the i-th bit is set
                    sum += weights[i];
                    count++;
                }
            }
            if (sum == k) {
                minObjects = Math.min(minObjects, count);
            }
        }
        return minObjects;
    }
}
