import java.lang.Math;
import java.util.*;

public class Exe1 {
    public static void main(String[] args) {
        int[] ar;
        ar = new int[10];
        for (int i = 0; i < 10; i++) {
            ar[i] = (int)Math.random()*100;
        }
        System.out.printf("%d",media(ar));
    }
    private static int media(int[] ar){
        int m = 0;
        int idx = 0;
        for (int num : ar) {
            System.out.printf("Elemento %d na posição %d\n",num,idx);
            idx++;
            m+= num;
        }
        return m/ar.length;
    }
}
