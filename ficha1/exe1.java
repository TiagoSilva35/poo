import java.util.i;

public class exe1{
	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		int n,k;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		System.out.println((factorial(n)/(factorial(k)*factorial(n-k))));
	}

	public static int factorial(int x) {
		if (x == 0) return 1;
		return x * factorial(x-1);
	}
}

