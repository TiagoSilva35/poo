public class Exe13 {
    
    /** 
     * @param a
     * @return int
     */
    private static int digits(int a){
        if (a == 0)return 1; 
        int c = 0;
        while(a > 0){
            c++;
            a /= 10;
        }
        return c;
    }
    public static void main(String[] args) {
        int n = 12345567;
        int x = 0;
        boolean flag = false;
        while(n > 0 && !flag){
            flag = ((n-x) % (Math.pow(10,digits(x))) == 0 ?  true : false);
            // System.out.println(n);
            n /= 10;
        }
        System.out.printf(flag ? "yes" : "no");
    }

}
