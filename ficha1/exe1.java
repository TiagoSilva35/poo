import java.util.*;

public class exe1{
    public static void main(String[] args) {
        int n,k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        System.out.println((f(n)/(f(k)* f(n-k))));
        sc.close();
    }
    public static int f(int x) {
        if (x == 0)return 1;
        return x * f(x-1);
    }
}

