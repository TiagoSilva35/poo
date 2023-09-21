public class Exe12 {
    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i += 100) {
            System.out.printf("lg(%d) = %d\n",i,lb(i));
        }
    }
    private static int lb(int x) {
        int num = 0;
        while (x >= 2){
            num++;
            x /= 2;
        }
        return num;
    }
}
