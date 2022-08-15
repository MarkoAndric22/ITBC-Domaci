import java.util.Arrays;

public class Zadatak2 {
    public static int[][] max(int[][] matrix){

        int colSum = 0, maxColSum =  0, maxColIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                colSum = colSum + matrix[j][i];
            }
            if (maxColSum < colSum) {
                maxColSum = colSum;
                maxColIndex = i;
            }
            colSum = 0;
        }
        for (int k = 0; k < matrix.length; k++) {

            int tmp = matrix[k][0];
            matrix[k][0] = matrix[k][maxColIndex];
            matrix[k][maxColIndex] =  tmp;
        }
       return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{3, 22, 1, 7},
                {9, 11, 5, 4},
                {6, 0, 133, 17},
                {7, 21, 14, 15}};
           System.out.println(Arrays.deepToString(max(matrix)));

    }
}


