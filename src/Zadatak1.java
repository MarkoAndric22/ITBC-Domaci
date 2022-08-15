import java.util.Arrays;

public class Zadatak1 {
    public static int[] max(int[][] matrix){

        int[]niz=new int[matrix.length];
        int max=0;
        for(int i = 0; i<matrix.length;i++){
            int sum=0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum+=matrix[i][j];

                if (sum>max)
                {
                    max=sum;
                    niz=matrix[i];
                }
            }

        }
        return niz;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 3, 22, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 13, 17 },
                { 7, 21, 14, 15 } };
        System.out.println(Arrays.toString(max(matrix)));
    }
}
