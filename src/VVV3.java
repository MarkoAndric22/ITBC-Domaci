import java.util.Arrays;

public class VVV3 {
    public static int[] max(int[] niz){
        int max = niz[0];
        int[] niz2 = niz;
        for(int i = 0; i<niz.length;i++){
            if(niz[i] > max){
                max = niz[i];
                niz[i]=niz2[0] ;
                niz2[0]=max;
            }
        }
        return niz2;
    }
    public static void main(String[] args) {
        int[] niz1 = {3234,12,124,6,-126,2,22,6661};
        System.out.println(Arrays.toString(max(niz1)));
    }
}
