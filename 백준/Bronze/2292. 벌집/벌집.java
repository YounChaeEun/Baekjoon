import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int N = Integer.parseInt(br.readLine());
		
		int count = 1;
		int a = 1;
		
		while(num > a) {
			a += 6 * count;
			count += 1;
		}
		System.out.print(count);
	}
}