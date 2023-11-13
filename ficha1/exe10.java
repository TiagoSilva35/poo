import java.util.*;

public class exe10 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n == inverte(n)){
            System.out.printf("Capicua\n");
        }
        else{
            System.out.printf("Não é capicua\n");
        }
        sc.close();
    }
    public static int inverte (int i){
        int temp = 0;
        while(i > 0){
            temp += i%10;
            temp*=10;
            i/=10;
        }
        return temp/10;
    }
}
