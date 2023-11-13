
public class exe4 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int n = 101;
        int c = 1;
        for (int i = 0; i < n; i++) {
            int temp = i*n;
            System.out.print(temp > 100?"Overflow": temp);
            if (temp > 100 || c == 4)break;
            System.out.print(", ");
            ++c;
        }
    }
}
