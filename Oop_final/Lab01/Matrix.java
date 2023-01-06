public class Matrix{
    public static void main(String[] args) {
        int rows = 2, columns = 4;
        
        int[][] MatrixA = {{1, 1, 1, 1}, {2, 3, 5, 2}};
        int[][] MatrixB = {{2, 3, 4, 5}, {2, 2, 4, -4}};
    
        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = MatrixA[i][j] + MatrixB[i][j];
            }
        }
        //Print Matrix Sum
        System.out.println("Ma trận tổng của hai ma trận đã cho là: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        }
}
}