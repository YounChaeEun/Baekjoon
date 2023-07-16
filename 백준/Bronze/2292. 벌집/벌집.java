import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int count = 1;
		int a = 1;
		
		while(num > a) {
			a += 6 * count;
			count += 1;
		}
		
		scanner.close();
		System.out.print(count);
	}
}