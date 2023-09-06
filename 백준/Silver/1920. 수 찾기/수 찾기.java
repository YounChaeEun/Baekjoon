import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cards[] = new int[N];
		for(int i=0; i<N; i++) {
			cards[i] = sc.nextInt();
		}
		Arrays.sort(cards);
		
		int M = sc.nextInt();
		for(int i=0; i<M; i++) {
			int num = sc.nextInt();
			System.out.println(check(cards, num));
		}
	}
	
	static int check(int[] cards, int M) {
		int left = 0; 
		int mid; 
		int right = cards.length - 1;
		
		while(left <= right) {
			mid = (left+right)/2;
			if(M > cards[mid]) {
				left = mid + 1;
			} else if(M < cards[mid]) {
				right = mid - 1;
			} else {
				return 1;
			}
		}
		return 0;
	}
}