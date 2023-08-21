import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] nums = new int[t];
		
		for(int i=0; i<t; i++) {
			nums[i] = sc.nextInt();
		}
		
		
		Arrays.sort(nums);
		for(int i=0; i<t; i++) {
			System.out.println(nums[i]);
		}
		
		sc.close();
	}
}