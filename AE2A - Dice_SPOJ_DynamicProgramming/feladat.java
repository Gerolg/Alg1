import java.util.Scanner;

public class DiceProbability {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (k < n || k > 6 * n) {
                System.out.println(0);
                continue;
            }

            long[][] dp = new long[n + 1][k + 1];
            dp[0][0] = 1;
            
            for (int i = 1; i <= n; i++) {
                for (int sum = 0; sum <= k; sum++) {
                    for (int face = 1; face <= 6; face++) {
                        if (sum >= face) {
                            dp[i][sum] = (dp[i][sum] + dp[i - 1][sum - face]) % MOD;
                        }
                    }
                }
            }

            long totalOutcomes = modPow(6, n, MOD);
            
            long favorableOutcomes = dp[n][k];
            long probabilityPercent = (favorableOutcomes * 100 / totalOutcomes) % MOD;
            
            System.out.println(probabilityPercent);
        }
        
        sc.close();
    }

    private static long modPow(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
