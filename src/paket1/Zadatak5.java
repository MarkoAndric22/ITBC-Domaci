package paket1;

import java.util.Arrays;

public class Zadatak5 {
//    1. Написати функцију која прима матрицу (2Д низ) и враћа највећи ред (по збиру)
//    Hint: Сетите се како смо радили највећи елемент низа
//    int[][] matrix = { { 3, 2, 1, 7 },
//            { 9, 11, 5, 4 },
//            { 6, 0, 13, 17 },
//            { 7, 21, 14, 15 } };
//
//    largestRow(matrix); // Враћа - [7, 21, 14, 15]
public static int[] max(int[][] matrix){

    int[] max = new int[matrix.length];
    int maxSum = 0;

    for(int i = 0; i<matrix.length;i++){
        int sum=0;
        for(int j = 0; j<matrix[i].length;j++)
        {
            sum+=matrix[i][j];

            if(maxSum < sum){
                maxSum = sum;
            max = matrix[i];
        }
    }

}return max;
}

    public static void main(String[] args) {
        int[][] matrix = { { 3, 2, 1, 7 },
            { 9, 11, 5, 4 },
            { 6, 0, 133, 17 },
            { 7, 21, 14, 15 } };
        System.out.println(Arrays.toString(max(matrix)));
    }
}
