import java.util.Scanner;

public class TetrahedronVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            double AB = sc.nextDouble();
            double AC = sc.nextDouble();
            double AD = sc.nextDouble();
            double BC = sc.nextDouble();
            double BD = sc.nextDouble();
            double CD = sc.nextDouble();
            
            double AB2 = AB * AB;
            double AC2 = AC * AC;
            double AD2 = AD * AD;
            double BC2 = BC * BC;
            double BD2 = BD * BD;
            double CD2 = CD * CD;
            
            double[][] cm = {
                {0, 1, 1, 1, 1},
                {1, 0, AB2, AC2, AD2},
                {1, AB2, 0, BC2, BD2},
                {1, AC2, BC2, 0, CD2},
                {1, AD2, BD2, CD2, 0}
            };
            
            double det = determinant(cm);
            double volume = Math.sqrt(-det / 288.0);
            System.out.printf("%.4f\n", volume);
        }
        
        sc.close();
    }
    
    public static double determinant(double[][] matrix) {
        int n = matrix.length;
        double det = 0;
        if (n == 1) {
            return matrix[0][0];
        } else if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            for (int i = 0; i < n; i++) {
                double[][] subMatrix = new double[n - 1][n - 1];
                for (int j = 1; j < n; j++) {
                    int colIndex = 0;
                    for (int k = 0; k < n; k++) {
                        if (k == i) continue;
                        subMatrix[j - 1][colIndex++] = matrix[j][k];
                    }
                }
                det += Math.pow(-1, i) * matrix[0][i] * determinant(subMatrix);
            }
        }
        return det;
    }
}
