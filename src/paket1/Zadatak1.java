package paket1;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] niz=new int[5][3];
        for (int i = 0; i < niz.length; i++) {
            for (int j=0;j<niz[i].length;j++) {
            niz[i][j]= sc.nextInt();
            }
        }
        System.out.println(sumaEl(niz));
    }

    public static int sumaEl(int[][] niz) {
        int sum=0;
        for (int i = 0; i <niz.length ; i++) {
            for (int j = 0; j < niz[i].length; j++) {
               if(i==j) sum+=niz[i][j];
            }
        }
        return sum;
    }
}
