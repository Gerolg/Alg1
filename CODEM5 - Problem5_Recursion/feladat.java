import java.util.*;

public class MinimumObjects {
    static int minObjects;

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
            minObjects = Integer.MAX_VALUE;
            findMinimumObjects(weights, n, k, 0, 0, 0);
            System.out.println(minObjects == Integer.MAX_VALUE ? "impossible" : minObjects);
        }
        sc.close();
    }

    static void findMinimumObjects(int[] weights, int n, int k, int index, int currentSum, int count) {
        if (currentSum == k) {
            minObjects = Math.min(minObjects, count);
            return;
        }
        if (currentSum > k || index == n) {
            return;
        }

        findMinimumObjects(weights, n, k, index + 1, currentSum + weights[index], count + 1);

        findMinimumObjects(weights, n, k, index + 1, currentSum, count);
    }
}
