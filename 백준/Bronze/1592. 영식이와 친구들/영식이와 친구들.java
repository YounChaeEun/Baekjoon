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

		while (seat[index] != m) {
	    		if (seat[index] % 2 == 1) {
	    			index = moveIndex(l, index, n);
	    		} else if (seat[index] % 2 == 0) {
	    			index = moveIndex(-l, index, n);
	    		}
	    		seat[index]++;
	    		count++;
	    	}
	    
	    	scanner.close();
	    	System.out.println(count);
	}
	
	private static int moveIndex(int step, int currentIndex, int length) {
		int nextIndex = currentIndex + step;
		if (nextIndex > length) {
			nextIndex -= length;
		} else if (nextIndex <= 0) {
			nextIndex += length;
		}
		return nextIndex;
	}
}
