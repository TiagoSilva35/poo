//import java.util.*;
//import java.lang.Math;

public class exe5 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int n1 = 220;
        int n2 = 284;
        System.out.println(divs(n1) + " " + divs(n2));
        if(divs(n1) == n2 && divs(n2) == n1){
            System.out.println("Amigos");
        }
        else{
            System.out.println("Não amigos");
        }

    }
    public static int divs(int x){
        int sum = 0;
        for(int i = 1; i < Math.sqrt(x) + 1 ; ++i){
            if (x % i == 0){
                sum += i;
                if(i != x/i)
                    sum += x/i;
            }
        }
        return sum - x;
    }
}
