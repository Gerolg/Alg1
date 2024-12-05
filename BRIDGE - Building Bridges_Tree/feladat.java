import java.util.*;

public class NonCuttingBridges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder result = new StringBuilder();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] firstSide = new int[n];
            int[] secondSide = new int[n];
            
            for (int i = 0; i < n; i++) {
                firstSide[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                secondSide[i] = sc.nextInt();
            }
            
            int maxBridges = calculateMaxBridges(secondSide);
            result.append(maxBridges).append("\n");
        }
        
        System.out.print(result.toString());
    }
    
    private static int calculateMaxBridges(int[] coordinates) {
        int[] dp = new int[coordinates.length];
        int length = 0;
        
        for (int coord : coordinates) {
            int pos = Arrays.binarySearch(dp, 0, length, coord);
            if (pos < 0) pos = -(pos + 1);
            dp[pos] = coord;
            if (pos == length) length++;
        }
        
        return length;
    }
}
