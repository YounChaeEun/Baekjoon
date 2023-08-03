
import java.util.Scanner;

public class Main {
	
	public static long gcdMethod(long a, long b) {
		long n;
		while (b!=0) {
		  n = a % b;
		  a = b;
		  b = n;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		long gcd = gcdMethod(Math.max(a, b), Math.min(a, b));
		long lcm = a*b/gcd;
		
		System.out.print(lcm);
		sc.close();
	}
}
