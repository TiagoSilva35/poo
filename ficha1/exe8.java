import java.util.Scanner;
import java.lang.Math;

public class exe8 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = (int)Math.pow(10,n-1); i < Math.pow(10,n); i++){
            int temp = (int)Math.pow(i,2);
            if (temp % (int)Math.pow(10,n) == i){
                System.out.printf("possui: %d (%d*%d = %d)\n",i,i,i,temp);
            }
        }
    }
}
