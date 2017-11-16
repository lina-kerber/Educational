public class MatrixSumDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {{-1, 2}, {3, 4}};
        System.out.println(difference(matrix));
    }

    private static int difference(int[][] matrix) {
        int n = matrix.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += matrix[i][i];
            result -= matrix[i][(n - 1) - i];

        }
        return Math.abs(result);
    }
}
