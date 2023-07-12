import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int l = scanner.nextInt();
		
		int[] seat = new int[n+1];
		int count = 0;
		seat[1] = 1;
		int index = 1;
		
		while(true) {
			if(seat[index] == m) {
				break;
			}
			else if(seat[index] % 2 == 1) {
				index += l;
				if(index > n) {
					index -= n;
				}
				seat[index] += 1;
				count += 1;
			}
			else if(seat[index] % 2 == 0) {
				index -= l;
				if (index <= 0) {
					index += n;
				}
				seat[index] += 1;
				count += 1;
			}
		}
		System.out.println(count);
	}
}