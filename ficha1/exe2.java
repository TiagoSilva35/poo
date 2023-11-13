import java.util.*;


public class exe2 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        int target;
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();
        while (sum <= target) {
            ++n;
            sum += n;
        }
        System.out.println(n);
        sc.close();

    }
}
