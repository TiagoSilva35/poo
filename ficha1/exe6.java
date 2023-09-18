import java.lang.Math;

public class exe6 {
    public static void main(String[] args) {
        int n = 999;
        for(int i = 100; i <= n; i++){
            if (sum(i)){
                System.out.println("Número Perfeito "+i);
            }
        }
    }
    public static boolean sum(int x){
        int sum = 0;
        int temp = x;
        while(temp != 0){
            sum += Math.pow(temp%10, 3);
            temp/=10;
        }
        if(sum == x)return true;
        else return false;
    }
}
