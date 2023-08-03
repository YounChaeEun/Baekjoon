import java.util.Scanner;

public class Main {
	static int n, gcd;
	static int youngerSisterNum, olderSister;
	static int distance[];
	
	public static int gcdMethod(int a, int b) {
		while (b!=0) {
		  n = a % b;
		  a = b;
		  b = n;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		youngerSisterNum = sc.nextInt();
		olderSister = sc.nextInt();
		distance = new int[youngerSisterNum];
		
		for(int i=0; i<youngerSisterNum; i++) {
			int youngerSister = sc.nextInt();
			distance[i] = Math.abs(olderSister - youngerSister);
		}
		
		gcd = distance[0];
		for(int i=0; i<distance.length-1; i++) {
			gcd = gcdMethod(Math.max(gcd,distance[i+1]), Math.min(gcd,distance[i+1]));
		} 
		
		System.out.println(gcd);
		sc.close();
	}
}