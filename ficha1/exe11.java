
public class exe11 {
    public static void main(String[] args) {
        int n = 5,m = 2;
        int x = mdc(n,m);
        System.out.printf("mmc = %d",n*m/x);
    }
    private static int mdc(int a , int b){
        if (a == 0) return b;
        if (b == 0) return a;
        return mdc(Math.min(a,b),Math.max(a,b)%Math.min(a,b));
    }
}
