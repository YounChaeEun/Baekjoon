import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int coord[][] = new int[t][2];
		
		for(int i=0; i<t; i++) {
			coord[i][0] = sc.nextInt();
			coord[i][1] = sc.nextInt();
			
		}
		Arrays.sort(coord, (o1, o2) -> {
		    if (o1[0] == o2[0]) {
		        return o1[1] - o2[1]; 
		    }
		    return o1[0] - o2[0];
		});
		
		for(int i=0; i<t; i++) {
			System.out.println(coord[i][0] + " " + coord[i][1]);
		}
	}
}