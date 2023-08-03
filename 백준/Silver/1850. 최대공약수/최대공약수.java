import java.util.Scanner;

public class Main {
	static long tmp, n, gcd;
	public static long gcdMethod(long a, long b) {
		if(a < b){
	        tmp = a;
	        a = b;
	        b = tmp;
	    } 
		
		while (b!=0) {
			n = a % b;
			a = b;
			b = n;
		}
		return a;
	}
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long gcd = gcdMethod(a, b);
		
		StringBuilder sb = new StringBuilder();
	    for(int i=1; i <= gcd; i++) sb.append("1");
	        
	    System.out.println(sb.toString());
		sc.close();
	}
}