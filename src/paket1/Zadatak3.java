package paket1;

import java.util.Arrays;

public class Zadatak3 {
    public static void main(String[] args) {
        int[][] matrix = { { 3, 2, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 135, 17 },
                { 7, 21, 14, 15 } };

        int[] maxArray = new int[matrix.length];
        int maxSum = 0;
        System.out.println(maxSum);

        for (int i = 0; i <matrix.length ; i++) {
            int sum = 0;
            for (int j = 0; j <matrix[i].length  ; j++) {
                sum+=matrix[i][j];
            }
            if (maxSum < sum)
            {
                maxSum = sum;
                maxArray=matrix[i];

            }

        }
        System.out.println(Arrays.toString(maxArray));

    }
}
