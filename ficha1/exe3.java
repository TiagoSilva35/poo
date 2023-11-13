import java.util.*;
import java.lang.Math;

public class exe3 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int zeros = 0,ones = 0,i = 0,newNum = 0;
        while(n != 0){
            if (n % 10 == 0) {
                zeros++;
            }
            else{
                ones++;
                newNum += Math.pow(2,i); 
            }
            n/=10;
            ++i;
        }
        System.out.println("zeros: "+zeros+" ones: "+ones+" Decimal: "+newNum);
        sc.close();        
    }
}
